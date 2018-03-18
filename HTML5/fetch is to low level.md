fetch is to low level
=====================

[Why I won’t be using Fetch API in my apps – Shahar Talmi – Medium](https://medium.com/@shahata/why-i-wont-be-using-fetch-api-in-my-apps-6900e6c6fe78)

axios by default has this options and better error handling (if server returns 404) than fetch

```
axios.defaults.baseURL = 'https://api.example.com';
axios.defaults.headers.common['Accept'] = 'application/json';
axios.defaults.headers.post['Content-Type'] = 'application/json';
```
`npm install --save axios`

>  people should use tools that abstract the low level layer and give them more high level API which better suits their purpose.