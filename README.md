https://chatgpt.com/c/678397d1-6bd0-8000-92fd-0108f494875e

Nguyễn Tùng Dương - 22se1

# Dự án Kiểm thử Thuật toán Dijkstra
# Tổng quan
Dự án này thực hiện việc cài đặt và kiểm thử thuật toán tìm đường đi ngắn nhất Dijkstra sử dụng JUnit. Việc triển khai bao gồm các ca kiểm thử toàn diện để đảm bảo tính chính xác của thuật toán và đạt được độ bao phủ 100%.
# Cấu trúc dự án
```
src/
├── main/java/com/employee/
│   └── Dijkstra.java           # Cài đặt thuật toán chính  
└── test/java/com/employee/
    └── DijkstraTest.java       # Các ca kiểm thử
```
# Chi tiết thuật toán
Thuật toán Dijkstra được cài đặt với các tính năng sau:
- Tìm đường đi ngắn nhất từ một đỉnh nguồn đến tất cả các đỉnh khác trong đồ thị có trọng số
- Xử lý được các đồ thị không liên thông
- Kiểm tra đầu vào với trường hợp trọng số âm
- Sử dụng hàng đợi ưu tiên để tối ưu việc chọn đỉnh
- Trả về kết quả là một mảng các khoảng cách

# Các ca kiểm thử
Bộ kiểm thử bao gồm nhiều kịch bản khác nhau:

Kiểm thử chức năng cơ bản:

- Đồ thị đơn giản có liên thông
- Đồ thị một đỉnh
- Đồ thị không có cạnh
- Đồ thị có trọng số lớn


Các trường hợp biên:

- Đồ thị không liên thông
- Đồ thị có trọng số âm (xử lý ngoại lệ)
- Các đỉnh không thể đến được
- Các đỉnh đã được thăm


Các trường hợp đặc biệt:

- Đồ thị rỗng
- Đồ thị có trọng số lớn
- Đồ thị với tất cả các đỉnh được thăm
- Các cấu hình đồ thị đa dạng
# Độ bao phủ kiểm thử
Bộ kiểm thử đạt được độ bao phủ câu lệnh 100% sử dụng JUnit. Độ bao phủ được đo bằng công cụ JaCoCo.

![image](https://github.com/user-attachments/assets/d5a2a713-3b88-49b6-9854-b80082ed1b0b)

# Quy trình phát triển

- Cài đặt ban đầu thuật toán Dijkstra
- Phát triển các ca kiểm thử toàn diện
- Phân tích độ bao phủ sử dụng JaCoCo
- Bổ sung ca kiểm thử để đạt độ bao phủ 100%
# Công nghệ sử dụng
- Java
- JUnit 5
- Maven
- JaCoCo để đo độ bao phủ mã nguồn



