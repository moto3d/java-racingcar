# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


<br>
<br>
<br>
<br>
<br>

## 3단계 - 자동차 경주

### 기능적 요구사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다 >> 테스트코드 OK
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다 >> 테스트코드 OK
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다 >> 테스트코드 OK
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

### 비기능적 요구사항
- 모든 로직에 단위 테스트를 구현한다 (UI로직 제외)
- 로직과 UI 의 분리 : 핵심로직과 Display 부분은 분리되어야 함
- UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리
- 자바코드 컨벤션을 지키자
  - code-style-java : https://www.jetbrains.com/help/idea/code-style-java.html
- else 예약어를 쓰지 않기
  - PR 제출전 else 로 검색한번 하기
  - early-return 방식으로 else 제거
  - switch/case 도 금지
- commit 로그
  - 커밋로그 컨벤션도 지켜서 개발하기

```text
feat (feature)
fix (bug fix)
docs (documentation)
style (formatting, missing semi colons, …)
refactor
test (when adding missing tests)
chore (maintain)
```


### step3 자동차경주를 진행하면서 느낀점
- 요구사항의 분리가 참 어렵다
- 요구사항을 분리해서 미리 테스트 코드를 작성하는게 여러운 이유
  - 무엇을 테스트할것인가?
  - 어떻게 테스트할것인가 ?
  - 요구사항은 추상적인데, 이를 테스트를 옮기는것이 설계인거같고 어렵다


### 자바 클래스 순서 컨벤션
- Java에서는 일반적으로 다음과 같은 순서로 멤버를 선언합니다
```text
상수 (static final 변수)
스태틱 변수 (static 변수)
인스턴스 변수
생성자
스태틱 메서드 (클래스 메서드)
인스턴스 메서드
이러한 순서는 주로 Java 커뮤니티에서 널리 사용되는 일종의 컨벤션
```

### step3 스터디노트 : DI 패턴과 DIP 원칙의 차이는 뭐야?

```text
Q) DI 패턴과 DIP 원칙의 차이

A) DI 패턴(Dependency Injection Pattern)은 의존성 주입 패턴으로, 객체 간의 의존성을 느슨하게 만들어 유연한 코드를 작성할 수 있도록 도와주는 디자인 패턴입니다. DI 패턴은 객체 간의 의존성을 외부에서 주입받는 방식으로 구현합니다.

DIP 원칙(Dependency Inversion Principle)은 객체 지향 프로그래밍의 SOLID 원칙 중 하나로, 상위 수준 모듈은 하위 수준 모듈에 의존해서는 안 되며, 추상화된 것은 구체적인 것에 의존해서도 안 된다는 원칙입니다. 즉, 의존성 주입을 통해 느슨한 결합을 구현하는 것이 중요하다는 원칙입니다.

DI 패턴은 객체 간의 의존성을 느슨하게 만들어 유연한 코드를 작성할 수 있도록 도와주는 디자인 패턴이며, DIP 원칙은 객체 간의 의존성을 느슨하게 만들어 유연한 코드를 작성할 수 있도록 도와주는 객체 지향 프로그래밍의 원칙입니다. 따라서 DI 패턴은 DIP 원칙을 구현하는 하나의 방법 중 하나입니다.
```

<br><br><br><br><br>

### Step3 자동차 경주 - 도메인 정리
- Round : 경주에서의 반복횟수 Round 라고 하는데, 입력받을때는 RoundIterations 라고 표시를 함
- Score : 
- Recode : 각 차량의 매 라운드마다 Progress정보, Score 에 따라 진행/정지가 결정되어 모든 라운드마다의 진행정보

- 출력관련
  - 1라운드 >> 각 차 남바별로 성적이 출력
<<<<<<< HEAD
  

<<<<<<< HEAD
=======

<br><br><br><br><br>
>>>>>>> 9ce42e59505098441d895a71b815bfcc0f4fb28c
=======
>>>>>>> b8d8ece5fd2708917f8a34289618a29482ed2856

## Step4 자동차 경주(우승자) 미션 정리

### 기능적 요구사항 (체크박스는 테스트코드 포함여부)

- [car class]
  - [x] 자동차 이름은 5자를 초과할수 없다
  - [x] 자동차에 이름을 부여할 수 있다
  - 자동차는 자동차 이름과 위치 정보를 가지는 Car 객체를 추가해 구현(테스트코드 없음)
- [input]
  - [x] 자동차 이름을 입력받을떄, 쉼표를 기준으로 구분한다

- [output]
  - [x] 전진하는 자동차를 출력할 때 이름을 같이 출력한다

- [carRacing] 
  - [x] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다
  - [x] 우승자는 여러명일 수 있다

[애매..?]
- [ ] 입력한 이름의 숫자 만큼 자동차 대수를 생성한다

### 비기능적 요구사항 / 준수여부
- [ ] 인덴트는 1단계만
- [ ] 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리
<<<<<<< HEAD
<<<<<<< HEAD
- [ ] 커밋은 기능 단위로
=======
- [ ] 커밋은 기능 단위로

<br><br><br><br><br>

## Step5 자동차 경주(리팩토링) 미션 정리


### Step5 에서 만족해야하는 기능적 요구사항
- Step5 에서 검증해야할 기능적 요구사항 = Step3 + Step4 합친것 = 테스트존재
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다

- [Racer]
  - [ ] 자동차 이름은 5자를 초과할수 없다
  - [ ] 자동차에 이름을 부여할 수 있다
  - [ ] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다
  - [ ] 입력한 이동 시도횟수 만큼 자동차가 이동을 시도한다
- [Match]
  - [ ] 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다
  - [ ] 우승자는 여러명일 수 있다
- [input]
  - [ ] 자동차 이름을 입력받을떄, 쉼표를 기준으로 구분한다
  - [ ] 입력한 이름 수 만큼 자동차가 경주에 참여한다
- [output]
  - [] 전진하는 자동차를 출력할 때 이름을 같이 출력한다
- [carRacing]
  - [] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다





### 리팩토링 요구사항 (비기능적 요구사항)
- MVC 패턴 적용
  - 모델(도메인) 과 표현(view/UI) 클래스 단위 분리 필요
  - 도메인은 UI 에 의존하지 않아야한다!
- 테스트가 가능한 부분과 그렇지 않은 부분을 분리해서, 테스트할수 있는 범위만 테스트하자

### 자체추가 제한사항
- Stream 을 사용하지 않는다



### 테스트코드 라이브템플릿 변경
- 테스트코드 라이브템플릿 변경 
  - 기본 이름을 제거 (테스트코드 함수에도 의미있는 이름을 붙여주기 위해)
  - 기본으로 fail(); 추가 >> 테스트를 작성하지 않으면 실패가 기본이 되어야하기 떄문에
```text
@DisplayName("")
@Test
public void () {
    //given
    //when
    //then
    fail();
}
```
>>>>>>> 9ce42e59505098441d895a71b815bfcc0f4fb28c
=======
- [ ] 커밋은 기능 단위로
>>>>>>> b8d8ece5fd2708917f8a34289618a29482ed2856
