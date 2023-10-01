# GraphQL
㊗️ GraphQL hiệu quả với những service yêu cầu về hiệu suất và tổng hợp data về một mối, ví dụ tìm user theo id kèm thông tin cá nhân và tất cả bài post facebook của user đó

🍇 Sử dụng GraphQL lấy ra những trường cần thiết, không gây thừa thiếu dữ liệu, tăng hiệu suất và sử dụng làm tổng hợp dữ liệu: báo cáo, mapping dữ liệu, ... 

![image](https://github.com/thinhotwp1/GraphQL/assets/61654110/df238b3c-653e-424c-a4ac-419559fec79a)


# Coppy lệnh dưới vào http://localhost:8080/graphiql?path=/graphql để xem cách graphql mapping dữ liệu !

```
# Coppy to http://localhost:8080/graphiql?path=/graphql to see how it work !
query graphql {
  UserById(id: "1") {
    id
    name
    username
    address {
      street
      suite
      city
      zipcode
    }
    phone
    website
    username
    company {
      name
      catchPhrase
      bs
    }
    posts {
      id
      title
      body
    }
  }
}
```

