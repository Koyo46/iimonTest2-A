# iimonTest2-A
ローカルでの実行方法

①自身が利用しているデータベースの情報を、application.propertiesに入力する。

②以下のsql文を実行する。 CREATE TABLE fruit ( id SERIAL PRIMARY KEY, name TEXT, price INTEGER );

③POST(application/json)で`http://localhost:8080/`に下記情報を送る。 { "name": "apple", "price": 200 }

④作成したテーブルにPOSTした情報が保存される。
