set names utf8;
set foreign_key_checks=0;

drop database if exists amoti;
create database if not exists amoti;

use amoti;

create table user_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) unique not null comment "ユーザーID",
password varchar(16) not null comment "パスワード",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
sex tinyint not null default 0 comment "姓別",
email varchar(32) not null comment "メールアドレス",
status tinyint not null default 0 comment "ステータス",
logined tinyint not null default 0 comment "ログインフラグ",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日"
)
default charset=utf8
comment="会員情報テーブル"
;

insert into user_info values
(1,"guest","guest","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"guest@gmail.com",0,0,now(),now()),
(2,"guest2","guest2","インターノウス","ゲストユーザー2","いんたーのうす","げすとゆーざー2",0,"guest2@gmail.com",0,0,now(),now()),
(3,"guest3","guest3","インターノウス","ゲストユーザー3","いんたーのうす","げすとゆーざー3",0,"guest3@gmail.com",0,0,now(),now()),
(4,"guest4","guest4","インターノウス","ゲストユーザー4","いんたーのうす","げすとゆーざー4",0,"guest4@gmail.com",0,0,now(),now()),
(5,"guest5","guest5","インターノウス","ゲストユーザー5","いんたーのうす","げすとゆーざー5",0,"guest5@gmail.com",0,0,now(),now()),
(6,"guest6","guest6","インターノウス","ゲストユーザー6","いんたーのうす","げすとゆーざー6",0,"guest6@gmail.com",0,0,now(),now()),
(7,"guest7","guest7","インターノウス","ゲストユーザー7","いんたーのうす","げすとゆーざー7",0,"guest7@gmail.com",0,0,now(),now()),
(8,"guest8","guest8","インターノウス","ゲストユーザー8","いんたーのうす","げすとゆーざー8",0,"guest8@gmail.com",0,0,now(),now()),
(9,"guest9","guest9","インターノウス","ゲストユーザー9","いんたーのうす","げすとゆーざー9",0,"guest9@gmail.com",0,0,now(),now()),
(10,"guest10","guest10","インターノウス","ゲストユーザー10","いんたーのうす","げすとゆーざー10",0,"guest10@gmail.com",0,0,now(),now()),
(11,"guest11","guest11","インターノウス","ゲストユーザー11","いんたーのうす","げすとゆーざー11",0,"guest11@gmail.com",0,0,now(),now()),
(12,"guest12","guest12","インターノウス","ゲストユーザー12","いんたーのうす","げすとゆーざー12",0,"guest12@gmail.com",0,0,now(),now()),
(13,"admin","admin","インターノウス","管理者ユーザー","いんたーのうす","かんりしゃゆーざー",0,"admin@gmail.com",1,0,now(),now()),
(14,"admin2","admin2","インターノウス","管理者ユーザー2","いんたーのうす","かんりしゃゆーざー2",0,"admin2@gmail.com",1,0,now(),now()),
(15,"admin3","admin3","インターノウス","管理者ユーザー3","いんたーのうす","かんりしゃゆーざー3",0,"admin3@gmail.com",1,0,now(),now()),
(16,"admin4","admin4","インターノウス","管理者ユーザー4","いんたーのうす","かんりしゃゆーざー4",0,"admin4@gmail.com",1,0,now(),now()),
(17,"admin5","admin5","インターノウス","管理者ユーザー5","いんたーのうす","かんりしゃゆーざー5",0,"admin5@gmail.com",1,0,now(),now()),
(18,"admin6","admin6","インターノウス","管理者ユーザー6","いんたーのうす","かんりしゃゆーざー6",0,"admin6@gmail.com",1,0,now(),now()),
(19,"admin7","admin7","インターノウス","管理者ユーザー7","いんたーのうす","かんりしゃゆーざー7",0,"admin7@gmail.com",1,0,now(),now()),
(20,"admin8","admin8","インターノウス","管理者ユーザー8","いんたーのうす","かんりしゃゆーざー8",0,"admin8@gmail.com",1,0,now(),now()),
(21,"admin9","admin9","インターノウス","管理者ユーザー9","いんたーのうす","かんりしゃゆーざー9",0,"admin9@gmail.com",1,0,now(),now()),
(22,"admin10","admin10","インターノウス","管理者ユーザー10","いんたーのうす","かんりしゃゆーざー10",0,"admin10@gmail.com",1,0,now(),now()),
(23,"admin11","admin11","インターノウス","管理者ユーザー11","いんたーのうす","かんりしゃゆーざー11",0,"admin11@gmail.com",1,0,now(),now()),
(24,"admin12","admin12","インターノウス","管理者ユーザー12","いんたーのうす","かんりしゃゆーざー12",0,"admin12@gmail.com",1,0,now(),now());

create table product_info(
id int primary key not null auto_increment comment "ID",
product_id int unique not null comment "商品ID",
product_name varchar(100) unique not null comment "商品名",
product_name_kana varchar(100) not null comment "商品名かな",
product_description varchar(255) not null comment "商品詳細",
category_id int not null not null comment "カテゴリID",
price int comment "価格",
image_file_path varchar(100) comment "画像ファイルパス",
image_file_name varchar(50) comment "画像ファイル名",
release_date datetime not null comment "発売年月",
release_company varchar(50) comment "発売会社",
status tinyint not null default 0 comment "ステータス",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日",
foreign key(category_id) references m_category(category_id)
)
default charset=utf8
comment="商品情報テーブル"
;

set foreign_key_checks=0;
insert into product_info values
( 1, 1,"Illustration１","いらすと１","Illustration１の商品詳細",2,100,"./images","sample1.jpg",now(),"発売会社",0,now(),now()),
( 2, 2,"Illustration２","いらすと２","Illustration２の商品詳細",2,200,"./images","sample1.jpg",now(),"発売会社",0,now(),now()),
( 3, 3,"Illustration３","いらすと３","Illustration３の商品詳細",2,300,"./images","sample1.jpg",now(),"発売会社",0,now(),now()),
( 4, 4,"Illustration４","いらすと４","Illustration４の商品詳細",2,100,"./images","sample1.jpg",now(),"発売会社",0,now(),now()),
( 5, 5,"Illustration５","いらすと５","Illustration５の商品詳細",2,200,"./images","sample1.jpg",now(),"発売会社",0,now(),now()),
( 6, 6,"Illustration６","いらすと６","Illustration６の商品詳細",2,300,"./images","sample1.jpg",now(),"発売会社",0,now(),now()),
( 7, 7,"Picture７","ぴくちゃー７","Picture７の商品詳細",3,100,"./images","sample2.jpg",now(),"発売会社",0,now(),now()),
( 8, 8,"Picture８","ぴくちゃー８","Picture８の商品詳細",3,200,"./images","sample2.jpg",now(),"発売会社",0,now(),now()),
( 9, 9,"Picture９","ぴくちゃー９","Picture９の商品詳細",3,300,"./images","sample2.jpg",now(),"発売会社",0,now(),now()),
( 10, 10,"Picture１０","ぴくちゃー１０","Picture１０の商品詳細",3,100,"./images","sample2.jpg",now(),"発売会社",0,now(),now()),
( 11, 11,"Picture１１","ぴくちゃー１１","Picture１１の商品詳細",3,200,"./images","sample2.jpg",now(),"発売会社",0,now(),now()),
( 12, 12,"Picture１２","ぴくちゃー１２","Picture１２の商品詳細",3,300,"./images","sample2.jpg",now(),"発売会社",0,now(),now()),
( 13, 13,"Photography１３","ふぉと１３","Photography１３の商品詳細",4,100,"./images","sample3.jpg",now(),"発売会社",0,now(),now()),
( 14, 14,"Photography１４","ふぉと１４","Photography１４の商品詳細",4,200,"./images","sample3.jpg",now(),"発売会社",0,now(),now()),
( 15, 15,"Photography１５","ふぉと１５","Photography１５の商品詳細",4,300,"./images","sample3.jpg",now(),"発売会社",0,now(),now()),
( 16, 16,"Photography１６","ふぉと１６","Photography１６の商品詳細",4,100,"./images","sample3.jpg",now(),"発売会社",0,now(),now()),
( 17, 17,"Photography１７","ふぉと１７","Photography１７の商品詳細",4,200,"./images","sample3.jpg",now(),"発売会社",0,now(),now()),
( 18, 18,"Photography１８","ふぉと１８","Photography１８の商品詳細",4,300,"./images","sample3.jpg",now(),"発売会社",0,now(),now()),
( 19, 19,"Others１９","そのた１９","Others１９の商品詳細",5,100,"./images","sample4.jpg",now(),"発売会社",0,now(),now()),
( 20, 20,"Others２０","そのた２０","Others２０の商品詳細",5,200,"./images","sample4.jpg",now(),"発売会社",0,now(),now()),
( 21, 21,"Others２１","そのた２１","Others２１の商品詳細",5,300,"./images","sample4.jpg",now(),"発売会社",0,now(),now()),
( 22, 22,"Others２２","そのた２２","Others２２の商品詳細",5,100,"./images","sample4.jpg",now(),"発売会社",0,now(),now()),
( 23, 23,"Others２３","そのた２３","Others２３の商品詳細",5,200,"./images","sample4.jpg",now(),"発売会社",0,now(),now()),
( 24, 24,"Others２４","そのた２４","Others２４の商品詳細",5,300,"./images","sample4.jpg",now(),"発売会社",0,now(),now());


create table cart_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
temp_user_id varchar(16) comment "仮ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "金額",
regist_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)
default charset=utf8
comment="カート情報テーブル"
;

create table purchase_history_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
product_id int not null comment "商品ID",
product_count int not null comment "個数",
price int not null comment "金額",
destination_id int not null comment "宛先情報ID",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日",
foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
)
default charset=utf8
comment="購入履歴情報テーブル";

create table destination_info(
id int primary key not null auto_increment comment "ID",
user_id varchar(16) not null comment "ユーザーID",
family_name varchar(32) not null comment "姓",
first_name varchar(32) not null comment "名",
family_name_kana varchar(32) not null comment "姓かな",
first_name_kana varchar(32) not null comment "名かな",
email varchar(32) not null comment "メールアドレス",
tel_number varchar(13) not null comment "電話番号",
user_address varchar(50) not null comment "住所",
regist_date datetime not null comment "登録日",
update_date datetime not null comment "更新日"
)
default charset=utf8
comment="宛先情報テーブル";

insert into destination_info values
(1,"guest","インターノウス","テストユーざー","いんたーのうす","てすとゆーざー","guest@internous.co.jp","080-1234-5678","東京都千代田区三番町１ー１　ＫＹ三番町ビル１Ｆ",now(),"0000-00-00 00:00:00");

create table m_category(
id int primary key not null comment "ID",
category_id int not null unique comment "カテゴリID",
category_name varchar(20) not null unique comment "カテゴリ名",
category_description varchar(100) comment "カテゴリ詳細",
insert_date datetime not null comment "登録日",
update_date datetime comment "更新日"
)
default charset=utf8
comment="カテゴリマスタテーブル"
;

insert into m_category values
(1,1,"全てのカテゴリー","Illustration/Picture/Photography/Others全てのカテゴリーが対象となります",now(), null),
(2,2,"Illustration","Illustrationに関するカテゴリーが対象となります",now(),null),
(3,3,"Picture","Pictureに関するカテゴリーが対象となります",now(),null),
(4,4,"Photography","Photographyに関するカテゴリーが対象となります",now(),null),
(5,5,"Others","Othersに関するカテゴリーが対象となります",now(),null);