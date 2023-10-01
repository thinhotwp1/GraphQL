# GraphQL
GraphQL with Java Spring Boot 🐐

👘 GraphQL là một ngôn ngữ truy vấn và một mô hình dựa trên HTTP cho phép bạn yêu cầu dữ liệu cụ thể mà bạn cần từ một API. GraphQL cho phép truy vấn dữ liệu bằng cách chỉ định cụ thể những trường dữ liệu muốn lấy, giúp tránh tình trạng over-fetching (lấy nhiều dữ liệu không cần thiết) và under-fetching (lấy quá ít dữ liệu) mà thường gặp khi sử dụng REST API.

🩹 Một trong những điểm mạnh của GraphQL là khả năng tự mô tả, nó cho phép bạn xem tất cả các trường và khả năng truy vấn của API trong một tài liệu duy nhất (thường là một tài liệu Schema).

![image](https://github.com/thinhotwp1/GraphQL/assets/61654110/e4c30d59-9a01-4ab6-a888-fd0643ae24c4)

👯‍♂️ Coppy đoạn truy vấn sau vào http://localhost:8080/graphiql?path=/graphql để xem cách graphql hoạt động:
```
#query graphql = query [my_project], example: query my_project{...}
query graphql {
  bookById(id: "book-1") {
    id
    name
    pageCount
    author {
      id
      firstName
      lastName
    }
  }
}
```
