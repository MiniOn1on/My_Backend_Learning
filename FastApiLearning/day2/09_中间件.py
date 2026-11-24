from fastapi import FastAPI

app = FastAPI()
# 中间件（Middleware）是一个在每次请求进入FastAPI应用时都会被执行的函数。
# 它在请求到达实际的路径操作（路由处理函数）之前运行，并且在响应返回给客户端之前再运行一次。

# 中间件代码的执行顺序按照代码顺序从后向前执行
@app.middleware("http")
async def middleware2(request, call_next):
    print("中间件2 start")
    response = await call_next(request)
    print("中间件2 end")
    return response


@app.middleware("http")
async def middleware1(request, call_next):
    print("中间件1 start")
    response = await call_next(request)
    print("中间件1 end")
    return response
# 洋葱模型，按照代码顺序从上向下包洋葱，包好了然后从外向内调用，再从内向外走出来
# 返回结果中间件1 start，中间件2 start，中间件2 end，中间件1 end

@app.get("/")
async def root():
    return {"message": "Hello World"}
