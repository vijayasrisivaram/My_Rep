set projectLocation=C:\Users\vijay\Desktop\Selenium\MyFrameWork
 
cd %projectLocation%
 
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
 
java org.testng.TestNG %projectLocation%\testng.xml