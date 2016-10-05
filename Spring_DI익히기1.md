**Dependency Injection (DI)**
의존성 주입
<br/>

**의존성**
사전적정의 : 다른 것에 의지하여 생활하거나 존재하는 성질
<br/>

**객체 의존성**
객체와 객체간에 긴밀하게 연결되어 있는 것
<br/>


**의존성이 강하다**
하나의 객체를 수정하면 연결된 객체 또한 수정해야할 가능성이 높다
<br/>


**의존성을 주입하다**
객체가 다른 객체에 의존하도록 만들어주다
<br/>



**Spring framework에서 의존성주입 기술을 사용하는 궁극적 이유는 의존성 낮추기이다**
<br/>


**Bean Container**
Spring에서 제공하는 의존성주입의 주체
<br/>


**Bean Container 가 하는 일**
- 객체 생성 (Create Beans)
- 객체사이의 의존성 주입 (perform dependency injection)
<br/>


**제어의 역전(Inversion of Control)**
프로그램의 주체가 나(App) 에서 Framework(Spring) 로 바뀜

`제어의 역전은 의존성주입기술로 달성된다.`

```
이전에 부모님이나 친구로 인해 소개팅을 봤을 때 나의 깽판치는 행위는 부모님이나 친구에게 큰영향력을 미친다 그러나 결혼중매업체에 의한 소개팅은 나의 깽판치는 행위가 누군가에게 그다지 큰 영향을 주지 않는 것과 같은 이치다
```

<br/>




**의존성 주입**
- 한 객체의 의존성이 객체 스스로가 아닌 framework에 의해서 주입되는 디자인패턴
- 이것은 framework에 의해 동적으로 주입됨으로써 여러개의 객체들 사이의 관계를 줄여준다
<br/>



_ _ _



**Spring Container**
- spring framework의 핵심요소
- beans를 포함하고 관리를 책임짐
	*객체생성
	*객체를 연결함
	*객체를 배열,설정함
	*객체의 lifecycle을 관리함
- 설정파일(configuration metadata)를 나타내는 여러가지
	*XML
	*Java annotations
	*Java code
- Container은 application을 형성하는 beans들을 관리하기위해 DI를 사용한다
- Spring은 두가지 타입의 Container을 가지고있다
	*BeanFactory
	*ApplicationContext
<br/>

**BeanFactory(Container type1)**
- 간단한 공장으로 주로 의존성주입을 위한것
- 제한된 resources를 가질때 사용함 e.g., mobil,applets etc.
- 실제인터페이스 : org.springframwork.beans.factory.BeanFactory
- 실제구현이름 : XMLBeanFactory
<br/>

**ApplicationContext(Comtainer type2)**
- 진보된,더 복잡한 공장
- 대부분은 이것을사용함
- 실제인터페이스 : org.springframwork.context.ApplicationContext
- 실제구현이름 : ClassPathXmlApplicationContext
<br/>


** 의존성 주입의 장점 (Advantages of DI)**
- 의존성을 줄임 (Reduceed Dependencies)
- 재사용성이 높은 코드 (More Reusable Code)
- 테스트가 용이한 코드 (More Testable Code)
- 가독성이 좋은 코드 (More Readable Code)
<br/>


_ _ _


**Bean이란?**
- Spring framework에서는 IoC Container에 의해 관리되는 POJO(순수객체)이다
- configuration metadata(XML)에 의해 만들어지고 제공된다
- 앱에 명시된 후에 객체는 getBean 함수로 불려진다
<br/>

**Spring Bean Definition **
- 스프링은 관리하기위해 bean을 정의함
- 전형적으로 XML 파일에 정의한다
- 주요 속성들
	*class(required) : 완저한java class name이 요구됨
	*id : 빈만의 유일한 정체성
	*scope : 객체의 범위
	*constructor-arg : 생성자에게 전달해주기위한 인자
	*property : 세터에게 전달해주기위한 인자
	*init, destroy method 
<br/>

**Spring Bean Scope**
- singleton : 오직 하나의 instance //default값
- prototype : getBean()을 호출할때마다 새로운 instance
- request
- session 
- global-session
<br/>

**singleton은 공유개념이라 상호배제작업이 필요하지만 
framework(Spring)가 알아서 해주기 때문에 실제로 신경쓰지 않아도된다**











