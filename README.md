Spring MVC Study</br>
=============

## 📋 Depedency Injection
<h4>- Bean Container</h4>

![Bean Container](https://user-images.githubusercontent.com/76934280/148174944-e289c948-3d87-4851-867e-f7e765403dc6.PNG)
1. Bean Container가 하는 일
   - beans를 만든다(= POJO)
   - 의존성 주입을 한다
   - 사용자가 직접 객체를 생성/관리하는 것이 아닌, Spring Container가 Bean을 생성/관리</br>
     -> ✏️Inversion of Control(제어의 역전): 프레임워크가 직접 관리
2. 설정파일은 3가지로 설정가능
   - XML
   - Java annotations(xml로 설정시 내용이 많아져서 사용)
   - Java-based Configuration
3. 의존성 주입의 장점
   - 의존성 감소: 변경에 덜 취약해짐
   - 코드의 재사용: 코드 변경 필요X
   - 다양한 테스트 용이: 모의 객체(올바른 값, null, exception처리)
   - 읽기 쉬운 코드: 구성 요소에 어떤 종속성이 있는지 쉽게 확인가능 
