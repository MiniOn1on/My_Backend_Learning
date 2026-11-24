#对于客户端引发的错误(4xx，如资源未找到、认证失败），应使用fastapi.HTTPException来中断正常处理流程，
#并返回标准错误响应。



from fastapi import FastAPI
from fastapi import HTTPException
app=FastAPI()
#需求：按id查询新闻→1- 6
@app.get("/news/{id}")
async def get_id(id:int):
    id_list=[1,2,3,4,5,6,7]
    if id not in id_list:
        raise HTTPException(status_code=404,detail="您查找的新闻不存在")
    return {"id":id}