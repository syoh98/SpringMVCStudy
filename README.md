Spring MVC Study</br>
=============

## ๐ Depedency Injection
<h4>- Bean Container</h4>

![Bean Container](https://user-images.githubusercontent.com/76934280/148174944-e289c948-3d87-4851-867e-f7e765403dc6.PNG)
1. Bean Container๊ฐ ํ๋ ์ผ
   - beans๋ฅผ ๋ง๋ ๋ค(= POJO)
   - ์์กด์ฑ ์ฃผ์์ ํ๋ค
   - ์ฌ์ฉ์๊ฐ ์ง์  ๊ฐ์ฒด๋ฅผ ์์ฑ/๊ด๋ฆฌํ๋ ๊ฒ์ด ์๋, Spring Container๊ฐ Bean์ ์์ฑ/๊ด๋ฆฌ</br>
     -> โ๏ธInversion of Control(์ ์ด์ ์ญ์ ): ํ๋ ์์ํฌ๊ฐ ์ง์  ๊ด๋ฆฌ
2. ์ค์ ํ์ผ์ 3๊ฐ์ง๋ก ์ค์ ๊ฐ๋ฅ
   - XML  [helloDI์ค์ต-XML](https://github.com/syoh98/SpringMVCStudy/tree/master/helloDI)
   - Java annotations(xml๋ก ์ค์ ์ ๋ด์ฉ์ด ๋ง์์ ธ์ ์ฌ์ฉ)  [helloDI์ค์ต-annotation](https://github.com/syoh98/SpringMVCStudy/tree/master/helloDI2)
   - Java-based Configuration
3. ์์กด์ฑ ์ฃผ์์ ์ฅ์ 
   - ์์กด์ฑ ๊ฐ์: ๋ณ๊ฒฝ์ ๋ ์ทจ์ฝํด์ง
   - ์ฝ๋์ ์ฌ์ฌ์ฉ: ์ฝ๋ ๋ณ๊ฒฝ ํ์X
   - ๋ค์ํ ํ์คํธ ์ฉ์ด: ๋ชจ์ ๊ฐ์ฒด(์ฌ๋ฐ๋ฅธ ๊ฐ, null, exception์ฒ๋ฆฌ)
   - ์ฝ๊ธฐ ์ฌ์ด ์ฝ๋: ๊ตฌ์ฑ ์์์ ์ด๋ค ์ข์์ฑ์ด ์๋์ง ์ฝ๊ฒ ํ์ธ๊ฐ๋ฅ 
