# message-service-tek-servis-PostreSQL-Docker-
Java &amp; Spring Boot kullanarak küçük bir Message Service oluşturulması

--------------------
Message Service:

API: /api/messages

HTTP POST ile yeni mesaj ekleniyor

HTTP GET ile mesajlar listeleniyor

---------------

-Message adında bir veri modeli tasarlandı.(id, author, content)

-Bir MessageController yazarak HTTP isteklerini karşılandı.

-MessageRepository ile veritabanı işlemlerini otomatik hale getirildi. (JPA)

-Bir veritabanına bağladım: PostgreSQL (açık kaynaklı, güçlü bir ilişkisel veritabanı)
-Her şeyi lokal makinede kurmak yerine, Docker kullanıldı.

Docker ile:(Uygulamayı ve ihtiyaç duyduğu ortamı "konteyner" içine koyar.Böylece farklı makinelerde aynı şekilde çalışır.)

PostgreSQL kurulmaya gerek kalmadan Spring Boot servisi kolayca ayağa kalktı

docker-compose up --build


**Bu komutla hem veritabanım hem API servisim aynı anda çalışmaya başladı.

------
application.properties içinde PostgreSQL’e bağlanacak ayarlar:

spring.datasource.url=jdbc:postgresql://postgres:5432/messagedb
spring.datasource.username=postgres
spring.datasource.password=1234
--------
Postman ile:(TEST)

/api/messages endpoint’ine JSON body gönderilerek mesaj eklendi.

Sonra yine aynı endpoint’e GET isteği atarak mesajlar çekildi.
