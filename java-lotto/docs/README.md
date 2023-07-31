# 🔍  프로젝트 설명

로또 게임 기능을 구현해야 한다. 로또 게임은 아래와 같은 규칙으로 진행된다.
```
- 로또 번호의 숫자 범위는 1~45까지이다.
- 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
- 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
    - 1등: 6개 번호 일치 / 2,000,000,000원
    - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
    - 3등: 5개 번호 일치 / 1,500,000원
    - 4등: 4개 번호 일치 / 50,000원
    - 5등: 3개 번호 일치 / 5,000
```
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다.
- 로또 1장의 가격은 1,000원이다.
- 당첨 번호와 보너스 번호를 입력받는다.
- 사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 종료한다.

---
게임의 진행 순서는 다음과 같다.

**입력**
- 로또 구입 금액을 입력 받는다. 구입 금액은 1,000원 단위로 입력 받으며 1,000원으로 나누어 떨어지지 않는 경우 예외 처리한다.
```
14000
```
- 당첨 번호를 입력 받는다. 번호는 쉼표(,)를 기준으로 구분한다.
```
1,2,3,4,5,6
```
- 보너스 번호를 입력 받는다.
```
7
```

**출력**
- 발행한 로또 수량 및 번호를 출력한다. 로또 번호는 오름차순으로 정렬하여 보여준다.
```
8개를 구매했습니다.
[8, 21, 23, 41, 42, 43] 
[3, 5, 11, 16, 32, 38] 
[7, 11, 16, 35, 36, 44] 
[1, 8, 11, 31, 41, 42] 
[13, 14, 16, 38, 42, 45] 
[7, 11, 30, 40, 42, 43] 
[2, 13, 22, 32, 38, 45] 
[1, 3, 5, 14, 22, 45]
```

- 당첨 내역을 출력한다.
```
3개 일치 (5,000원) - 1개
4개 일치 (50,000원) - 0개
5개 일치 (1,500,000원) - 0개
5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
6개 일치 (2,000,000,000원) - 0개
```

- 수익률은 소수점 둘째 자리에서 반올림한다. (ex. 100.0%, 51.5%, 1,000,000.0%)
```
총 수익률은 62.5%입니다.
```

- 예외 상황시 에러 문구를 출력해야 한다.
```
[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.
```

**실행 결과 예시**
```
구입금액을 입력해 주세요.
8000

8개를 구매했습니다.
[8, 21, 23, 41, 42, 43] 
[3, 5, 11, 16, 32, 38] 
[7, 11, 16, 35, 36, 44] 
[1, 8, 11, 31, 41, 42] 
[13, 14, 16, 38, 42, 45] 
[7, 11, 30, 40, 42, 43] 
[2, 13, 22, 32, 38, 45] 
[1, 3, 5, 14, 22, 45]

당첨 번호를 입력해 주세요.
1,2,3,4,5,6

보너스 번호를 입력해 주세요.
7

당첨 통계
---
3개 일치 (5,000원) - 1개
4개 일치 (50,000원) - 0개
5개 일치 (1,500,000원) - 0개
5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
6개 일치 (2,000,000,000원) - 0개
총 수익률은 62.5%입니다.
```

---
# 📝 기능 구현 목록
- [x] 로또를 생성하는 기능
  - [x] 로또 번호가 1부터 45 사이의 값을 벗어나면 예외 처리한다.
  - [x] 로또 번호에 중복이 있으면 예외 처리한다.
  - [x] 로또 번호의 길이가 6이 아니면 예외 처리한다.
- [x] 구입 금액을 입력받는 기능
  - [x] 1,000 으로 나눌 수 있는 숫자가 아니면 예외 처리한다.
- [x] 1부터 45 사이의 서로 다른 랜덤한 수 6개를 뽑는 기능
- [x] 발행한 로또 번호를 오름차순으로 정렬하는 기능
- [x] 로또 수량 및 발행한 로또 번호를 출력하는 기능
- [x] 당첨 번호를 입력받는 기능
- [x] 보너스 번호를 입력받는 기능
  - [x] 이미 당첨 번호로 지정된 숫자를 입력시 예외 처리한다.
  - [x] 보너스 번호가 1부터 45 사이의 값을 벗어나면 예외 처리한다.
- [x] 두 로또의 발행 번호 간 공통 번호를 알아내는 기능 
- [x] 당첨 결과를 계산하는 기능
- [x] 당첨 결과를 출력하는 기능
- [x] 수익율을 계산하는 기능
- [x] 수익율을 출력하는 기능