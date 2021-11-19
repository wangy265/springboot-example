
<a name="paths"></a>
## 资源

<a name="address-interfaces_resource"></a>
### Address Interfaces
Address Controller


<a name="addusingpost"></a>
#### Add Address
```
POST /address/add
```


##### 参数

|类型|名称|类型|
|---|---|---|
|**Body**|**city**  <br>*必填*|string|
|**Body**|**zipcode**  <br>*必填*|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/address/add
```


###### 请求 body
```
json :
{ }
```


##### HTTP响应示例

###### 响应 200
```
json :
"string"
```


<a name="user-interfaces_resource"></a>
### User Interfaces
User Controller


<a name="addusingpost_1"></a>
#### Add User
```
POST /user/add
```


##### 参数

|类型|名称|类型|
|---|---|---|
|**Body**|**userParam**  <br>*必填*|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|string|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/user/add
```


###### 请求 body
```
json :
{ }
```


##### HTTP响应示例

###### 响应 200
```
json :
"string"
```


<a name="listusingget"></a>
#### Query User List
```
GET /user/list
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [UserVo](#uservo) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/user/list
```


##### HTTP响应示例

###### 响应 200
```
json :
[ {
  "address" : {
    "city" : "string",
    "zipcode" : "string"
  },
  "age" : 0,
  "name" : "string"
} ]
```



