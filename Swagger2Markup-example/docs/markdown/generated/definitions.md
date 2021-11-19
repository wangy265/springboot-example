
<a name="definitions"></a>
## 定义

<a name="address"></a>
### Address

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|City  <br>**样例** : `"string"`|string|
|**zipcode**  <br>*可选*|Zipcode  <br>**样例** : `"string"`|string|


<a name="addressvo"></a>
### AddressVo

|名称|说明|类型|
|---|---|---|
|**city**  <br>*可选*|**样例** : `"string"`|string|
|**zipcode**  <br>*可选*|**样例** : `"string"`|string|


<a name="user"></a>
### User

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|Address  <br>**样例** : `"[address](#address)"`|[Address](#address)|
|**age**  <br>*可选*|Age  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|Name  <br>**样例** : `"string"`|string|


<a name="uservo"></a>
### UserVo

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|**样例** : `"[addressvo](#addressvo)"`|[AddressVo](#addressvo)|
|**age**  <br>*可选*|**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|**样例** : `"string"`|string|



