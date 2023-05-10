# KAKAO 쇼핑

## API 요청

### 1. 회원가입
- method : post
- url : http://localhost:8080/join
- request body : 
```json
{
  "email":"ssar@nate.com",
  "password":"1234",
  "username":"ssar"
}
```
- response body : 
```json
{
  "success": true,
  "response": {
    "userId": 3,
    "email": "ssar@nate.com",
    "username": "ssar"
  },
  "error": null
}
```

### 2. 로그인
- method : post
- url : http://localhost:8080/login
- request body :
```json
{
  "email":"ssar@nate.com",
  "password":"1234"
}
```
- response body :
```json
{
  "success": true,
  "response": null,
  "error": null
}
```

- response header :
```text
Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzc2FyQG5hdGUuY29tIiwicm9sZSI6IlJPTEVfVVNFUiIsImlkIjozLCJleHAiOjE2ODM3MzEzOTZ9.4o5as1_PpUcMjUTTYI9i7Xz7lgisqC62wBNyE85qbE5stBMxYIBlWgE4tdNKKzBsLyJ3ZhsiNYssh8y6v7zs0A
```

```text
토큰에 담긴 페이로드
email, roles
```

### 3. 동일 이메일 체크
- method : post
- url : http://localhost:8080/check
- request body :
```json
{
    "email":"cos@nate.com"
}
```
- response body :
```json
{
    "success": true,
    "response": null,
    "error": null
}
```

### 4. 상품목록 보기
- method : get
- url : http://localhost:8080/products
- request header :
```text
Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzc2FyQG5hdGUuY29tIiwicm9sZSI6IlJPTEVfVVNFUiIsImV4cCI6MTY4MzczMjY1MiwidXNlcklkIjozfQ.xlQksBtOBczgeuaanYViiqrMTx5jijsRmiaEdlm-AB_ykIerS5vtZIFKPVZrQGhE2ofBS_jQD891vxyOBt4G1g
```
- response body :
```json
{
  "success": true,
  "response": [
    {
      "productId": 1,
      "productName": "기본에 슬라이딩 지퍼백 크리스마스/플라워에디션 에디션 외 주방용품 특가전",
      "description": "",
      "image": "/images/1.jpg",
      "price": 1000
    },
    {
      "productId": 2,
      "productName": "[황금약단밤 골드]2022년산 햇밤 칼집밤700g외/군밤용/생율",
      "description": "",
      "image": "/images/2.jpg",
      "price": 2000
    },
    {
      "productId": 3,
      "productName": "삼성전자 JBL JR310 외 어린이용/성인용 헤드셋 3종!",
      "description": "",
      "image": "/images/3.jpg",
      "price": 30000
    },
    {
      "productId": 4,
      "productName": "바른 누룽지맛 발효효소 2박스 역가수치보장 / 외 7종",
      "description": "",
      "image": "/images/4.jpg",
      "price": 4000
    },
    {
      "productId": 5,
      "productName": "[더주] 컷팅말랑장족, 숏다리 100g/300g 외 주전부리 모음 /중독성 최고/마른안주",
      "description": "",
      "image": "/images/5.jpg",
      "price": 5000
    },
    {
      "productId": 6,
      "productName": "굳지않는 앙금절편 1,050g 2팩 외 우리쌀떡 모음전",
      "description": "",
      "image": "/images/6.jpg",
      "price": 15900
    },
    {
      "productId": 7,
      "productName": "eoe 이너딜리티 30포, 오렌지맛 고 식이섬유 보충제",
      "description": "",
      "image": "/images/7.jpg",
      "price": 26800
    },
    {
      "productId": 8,
      "productName": "제나벨 PDRN 크림 2개. 피부보습/진정 케어",
      "description": "",
      "image": "/images/8.jpg",
      "price": 25900
    },
    {
      "productId": 9,
      "productName": "플레이스테이션 VR2 호라이즌 번들. 생생한 몰입감",
      "description": "",
      "image": "/images/9.jpg",
      "price": 797000
    }
  ],
  "error": null
}
```

### 5. 상품 한건 보기
- method : get
- url : http://localhost:8080/products/{id}
- request header :
```text
Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzc2FyQG5hdGUuY29tIiwicm9sZSI6IlJPTEVfVVNFUiIsImV4cCI6MTY4MzczMjY1MiwidXNlcklkIjozfQ.xlQksBtOBczgeuaanYViiqrMTx5jijsRmiaEdlm-AB_ykIerS5vtZIFKPVZrQGhE2ofBS_jQD891vxyOBt4G1g
```
- response body :
```json
{
  "success": true,
  "response": {
    "productId": 1,
    "productName": "기본에 슬라이딩 지퍼백 크리스마스/플라워에디션 에디션 외 주방용품 특가전",
    "description": "",
    "image": "/images/1.jpg",
    "price": 1000
  },
  "error": null
}
```

### 6. 상품 옵션 보기
- method : get
- url : http://localhost:8080/products/{id}/options
- request header :
```text
Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzc2FyQG5hdGUuY29tIiwicm9sZSI6IlJPTEVfVVNFUiIsImV4cCI6MTY4MzczMjY1MiwidXNlcklkIjozfQ.xlQksBtOBczgeuaanYViiqrMTx5jijsRmiaEdlm-AB_ykIerS5vtZIFKPVZrQGhE2ofBS_jQD891vxyOBt4G1g
```
- response body :
```json
{
  "success": true,
  "response": [
    {
      "optionId": 1,
      "productId": 1,
      "optionName": "01. 슬라이딩 지퍼백 크리스마스에디션 4종",
      "price": 10000
    },
    {
      "optionId": 2,
      "productId": 1,
      "optionName": "02. 슬라이딩 지퍼백 플라워에디션 5종",
      "price": 10900
    },
    {
      "optionId": 3,
      "productId": 1,
      "optionName": "고무장갑 베이지 S(소형) 6팩",
      "price": 9900
    },
    {
      "optionId": 4,
      "productId": 1,
      "optionName": "뽑아쓰는 키친타올 130매 12팩",
      "price": 16900
    },
    {
      "optionId": 5,
      "productId": 1,
      "optionName": "2겹 식빵수세미 6매",
      "price": 8900
    }
  ],
  "error": null
}
```

### 7. 전체 옵션 보기
- method : get
- url : http://localhost:8080/options
- request header :
```text
Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzc2FyQG5hdGUuY29tIiwicm9sZSI6IlJPTEVfVVNFUiIsImV4cCI6MTY4MzczMjY1MiwidXNlcklkIjozfQ.xlQksBtOBczgeuaanYViiqrMTx5jijsRmiaEdlm-AB_ykIerS5vtZIFKPVZrQGhE2ofBS_jQD891vxyOBt4G1g
```
- response body :
```json
{
  "success": true,
  "response": [
    {
      "optionId": 1,
      "productId": 1,
      "optionName": "01. 슬라이딩 지퍼백 크리스마스에디션 4종",
      "price": 10000
    },
    {
      "optionId": 2,
      "productId": 1,
      "optionName": "02. 슬라이딩 지퍼백 플라워에디션 5종",
      "price": 10900
    },
    {
      "optionId": 3,
      "productId": 1,
      "optionName": "고무장갑 베이지 S(소형) 6팩",
      "price": 9900
    },
    {
      "optionId": 4,
      "productId": 1,
      "optionName": "뽑아쓰는 키친타올 130매 12팩",
      "price": 16900
    },
    {
      "optionId": 5,
      "productId": 1,
      "optionName": "2겹 식빵수세미 6매",
      "price": 8900
    },
    {
      "optionId": 6,
      "productId": 2,
      "optionName": "22년산 햇단밤 700g(한정판매)",
      "price": 9900
    },
    {
      "optionId": 7,
      "productId": 2,
      "optionName": "22년산 햇단밤 1kg(한정판매)",
      "price": 14500
    },
    {
      "optionId": 8,
      "productId": 2,
      "optionName": "밤깎기+다회용 구이판 세트",
      "price": 5500
    },
    {
      "optionId": 9,
      "productId": 3,
      "optionName": "JR310 (유선 전용) - 블루",
      "price": 29900
    },
    {
      "optionId": 10,
      "productId": 3,
      "optionName": "JR310BT (무선 전용) - 레드",
      "price": 49900
    },
    {
      "optionId": 11,
      "productId": 3,
      "optionName": "JR310BT (무선 전용) - 그린",
      "price": 49900
    },
    {
      "optionId": 12,
      "productId": 3,
      "optionName": "JR310BT (무선 전용) - 블루",
      "price": 49900
    },
    {
      "optionId": 13,
      "productId": 3,
      "optionName": "T510BT (무선 전용) - 블랙",
      "price": 52900
    },
    {
      "optionId": 14,
      "productId": 3,
      "optionName": "T510BT (무선 전용) - 화이트",
      "price": 52900
    },
    {
      "optionId": 15,
      "productId": 4,
      "optionName": "선택01_바른곡물효소 누룽지맛 2박스",
      "price": 17900
    },
    {
      "optionId": 16,
      "productId": 4,
      "optionName": "선택02_바른곡물효소누룽지맛 6박스",
      "price": 50000
    },
    {
      "optionId": 17,
      "productId": 4,
      "optionName": "선택03_바른곡물효소3박스+유산균효소3박스",
      "price": 50000
    },
    {
      "optionId": 18,
      "productId": 4,
      "optionName": "선택04_바른곡물효소3박스+19종유산균3박스",
      "price": 50000
    },
    {
      "optionId": 19,
      "productId": 5,
      "optionName": "01. 말랑컷팅장족 100g",
      "price": 4900
    },
    {
      "optionId": 20,
      "productId": 5,
      "optionName": "02. 말랑컷팅장족 300g",
      "price": 12800
    },
    {
      "optionId": 21,
      "productId": 5,
      "optionName": "03. 눌린장족 100g",
      "price": 4900
    },
    {
      "optionId": 22,
      "productId": 6,
      "optionName": "굳지않는 쑥 앙금 절편 1050g",
      "price": 15900
    },
    {
      "optionId": 23,
      "productId": 6,
      "optionName": "굳지않는 흑미 앙금 절편 1050g",
      "price": 15900
    },
    {
      "optionId": 24,
      "productId": 6,
      "optionName": "굳지않는 흰 가래떡 1050g",
      "price": 15900
    },
    {
      "optionId": 25,
      "productId": 7,
      "optionName": "이너딜리티 1박스",
      "price": 26800
    },
    {
      "optionId": 26,
      "productId": 7,
      "optionName": "이너딜리티 2박스+사은품 2종",
      "price": 49800
    },
    {
      "optionId": 27,
      "productId": 8,
      "optionName": "제나벨 PDRN 자생크림 1+1",
      "price": 25900
    },
    {
      "optionId": 28,
      "productId": 9,
      "optionName": "플레이스테이션 VR2 호라이즌 번들",
      "price": 839000
    },
    {
      "optionId": 29,
      "productId": 9,
      "optionName": "플레이스테이션 VR2",
      "price": 797000
    },
    {
      "optionId": 30,
      "productId": 10,
      "optionName": "홍가리비2kg(50미이내)",
      "price": 8900
    },
    {
      "optionId": 31,
      "productId": 11,
      "optionName": "궁채 절임 1kg",
      "price": 6900
    },
    {
      "optionId": 32,
      "productId": 11,
      "optionName": "양념 깻잎 1kg",
      "price": 8900
    },
    {
      "optionId": 33,
      "productId": 11,
      "optionName": "된장 깻잎 1kg",
      "price": 8900
    },
    {
      "optionId": 34,
      "productId": 11,
      "optionName": "간장 깻잎 1kg",
      "price": 7900
    },
    {
      "optionId": 35,
      "productId": 11,
      "optionName": "고추 무침 1kg",
      "price": 8900
    },
    {
      "optionId": 36,
      "productId": 11,
      "optionName": "파래 무침 1kg",
      "price": 9900
    },
    {
      "optionId": 37,
      "productId": 12,
      "optionName": "01_순수소프트 27m 30롤 2팩",
      "price": 28900
    },
    {
      "optionId": 38,
      "productId": 12,
      "optionName": "02_벚꽃 프리미엄 27m 30롤 2팩",
      "price": 32900
    },
    {
      "optionId": 39,
      "productId": 13,
      "optionName": "(증정) 초미세모 칫솔 12개 x 2개",
      "price": 11900
    },
    {
      "optionId": 40,
      "productId": 13,
      "optionName": "(증정) 잇몸케어 치약 100G 3개 x 2개",
      "price": 16900
    },
    {
      "optionId": 41,
      "productId": 13,
      "optionName": "(증정) 구취케어 치약 100G 3개 x 2개",
      "price": 16900
    },
    {
      "optionId": 42,
      "productId": 13,
      "optionName": "(증정)화이트케어 치약 100G 3개 x 2개",
      "price": 19900
    },
    {
      "optionId": 43,
      "productId": 13,
      "optionName": "(증정) 어린이 칫솔 12EA",
      "price": 9900
    },
    {
      "optionId": 44,
      "productId": 14,
      "optionName": "[가정용] 샤인머스켓 1kg 2수내외",
      "price": 9900
    },
    {
      "optionId": 45,
      "productId": 14,
      "optionName": "[특품] 샤인머스켓 1kg 1-2수",
      "price": 12900
    },
    {
      "optionId": 46,
      "productId": 14,
      "optionName": "[특품] 샤인머스켓 2kg 2-3수",
      "price": 23900
    },
    {
      "optionId": 47,
      "productId": 15,
      "optionName": "화이트",
      "price": 148000
    },
    {
      "optionId": 48,
      "productId": 15,
      "optionName": "블랙",
      "price": 148000
    }
  ],
  "error": null
}
```