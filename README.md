### baseball project
스프링 수업 완료 실력확인 프로젝트

### MariaDB 사용자 생성 및 권한 주기
```sql
create user 'final'@'%' identified BY '1234';
GRANT ALL PRIVILEGES ON *.* TO 'final'@'%';
create database baseball;
use baseball;
```

### 테이블 생성
```sql
CREATE TABLE stadium(
   id INT auto_increment primary key,
   name VARCHAR(100) unique not null,
   createdAt TIMESTAMP
) engine=InnoDB default charset=UTF8;

CREATE TABLE team(
   id int auto_increment primary key,
   name VARCHAR(50) unique not null,
   stadiumId INT NOT NULL,
   createdAt TIMESTAMP
) engine=InnoDB default charset=UTF8;

CREATE TABLE player(
   id int auto_increment primary key,
    name varchar(100) unique not null,
    teamId INT,
    position varchar(100) not null,
    isExpelled BOOLEAN DEFAULT 0,
    createdAt timestamp
) engine=InnoDB default charset=UTF8;

CREATE TABLE expelled(
   id int auto_increment primary key,
   playerId INT UNIQUE NOT NULL,
   reason VARCHAR(200) NOT NULL,
   createdAt timestamp
) engine=InnoDB default charset=UTF8;
```

### 더미 데이터 추가
```sql
INSERT INTO stadium(NAME, createdAt) VALUES('사직야구장',NOW());
INSERT INTO stadium(NAME, createdAt) VALUES('잠실야구장',NOW());
INSERT INTO stadium(NAME, createdAt) VALUES('고척야구장',NOW());
COMMIT;

INSERT INTO team(NAME, stadiumId,createdAt) VALUES('롯데 자이언츠', 1, NOW());
INSERT INTO team(NAME, stadiumId,createdAt) VALUES('LG 트윈스', 2, NOW());
INSERT INTO team(NAME, stadiumId,createdAt) VALUES('키움 히어로즈', 3, NOW());
COMMIT;

INSERT INTO player(NAME, teamId, POSITION, createdAt) VALUES('이대호', 1, '1루수', NOW());
INSERT INTO player(NAME, teamId, POSITION, createdAt) VALUES('한동희', 1, '3루수', NOW());
INSERT INTO player(NAME, teamId, POSITION, createdAt) VALUES('나균안', 1, '투수', NOW());
INSERT INTO player(NAME, teamId, POSITION, createdAt) VALUES('유강남', 2, '포수', NOW());
INSERT INTO player(NAME, teamId, POSITION, createdAt) VALUES('채은성', 2, '1루수', NOW());
INSERT INTO player(NAME, teamId, POSITION, createdAt) VALUES('박해민', 2, '중견수', NOW());
INSERT INTO player(NAME, teamId, POSITION, createdAt) VALUES('이정후', 3, '중견수', NOW());
INSERT INTO player(NAME, teamId, POSITION, createdAt) VALUES('김혜성', 3, '2루수', NOW());
INSERT INTO player(NAME, teamId, POSITION, createdAt) VALUES('요키시', 3, '투수', NOW());
COMMIT;

INSERT INTO expelled(playerId, reason, createdAt) VALUES(1, '은퇴', NOW());
INSERT INTO expelled(playerId, reason, createdAt) VALUES(4, '부상', NOW());
INSERT INTO expelled(playerId, reason, createdAt) VALUES(9, '웨이버', NOW());
COMMIT;
```

### 테이블 설정 utf-8로 변경
```sql
ALTER TABLE stadium CONVERT TO CHARACTER SET utf8;
ALTER TABLE team CONVERT TO CHARACTER SET UTF8;
ALTER TABLE player CONVERT TO CHARACTER SET utf8;
ALTER TABLE expelled CONVERT TO CHARACTER SET UTF8;
```
