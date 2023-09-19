Feature: Main page 'https://skillfactory.ru/' is open
  #Проверка того, что главная страница открывается
  Scenario: Heading of the the Main page is visible
    Given Main page "https://skillfactory.ru/" is open
    Then Heading is visible
  #Проверка того, что страница со всеми курсами открывается
  Scenario: A page opens with all courses
    Given The 'Все курсы' button is clicked
    Then A page with all courses is opened
    #Проверка заполнения отпраки формы для курса Python Developer
  Scenario: Send a request for a Python Developer course
  Given Open a page with Python Developer course
    And The application form for the course is filled in
    And The application has been sent
    Then The confirmation page opened
    #Проверка открытия раздела Data Science из выпадающего списка
  Scenario: Go to the data science section from the drop-down list
    Given Open a drop-down list with all courses
    And Select Data Science item
    Then A page with courses on data science has opened
    #Проверка открытия странцы с бесплатными курсами
  Scenario: Go to the page with free courses
    Given Click the button with free courses in the header
    Then A page with free courses is opened
    #Проверка открытия страницы центра карьеры
   Scenario: Go to the career center page
    Given Click the career center button in the header
    Then The career center page has opened
    #Проверка открытия страницы с контактами
  Scenario: Go to the page with contacts
    Given Click the button with contacts in the header
    Then A page with contacts is opened
    #Проверка открытия страницы с медиа
  Scenario: Go to the page with media
    Given Click the button with media in the header
    Then A page with media is opened
    #Проверка открытия страницы с корпоративным обучением
  Scenario: Go to the page with corporate education
    Given Click the button with corporate education in the header
    Then A page with corporate education is opened
    #Негативный кейс заполнения формы для отправки контактов на главной странице
  Scenario: Fill in the form on the main page with incorrect data
    Given Fill incorrect data into the form on the main page
    And Click the send button
    Then Get a message about incorrectly entered data
    #Проверка открытия страницы с курсами по программированию
  Scenario: Go to the page with programming courses
    Given Сlick on the button with the direction of programming
    Then A page with programming courses is opened
    #Проверка открытия страницы с курсами по тестированию
  Scenario: Go to the page with testing courses
    Given Сlick on the button with the direction of testing
    Then A page with testing courses is opened
    #Проверка открытия страницы с курсами по аналитике данных
  Scenario: Go to the page with data analytics courses
    Given Сlick on the button with the direction of data analitics
    Then A page with data analitics courses is opened
    #Проверка открытия страницы c высшими образовательными программами
  Scenario: Go to the page with higher education
    Given Сlick on the button with the direction of higher education
    Then A page with higher education is opened
    #Проверка открытия страницы с курсами по дизайну
  Scenario: Go to the page with design courses
    Given Сlick on the button with the direction of design
    Then A page with design courses is opened
    #Проверка открытия страницы с курсами по менеджменту
  Scenario: Go to the page with management courses
    Given Сlick on the button with the direction of management
    Then A page with management courses is opened
    #Проверка заполнения и отправки формы для курса Тестировщик Java
  Scenario: Send a request for a Java Tester course
    Given Open a page with Testing courses
    And Choose a selenium webdriver course
    And Choose a qa engineer in java
    And Click on the button to enroll in the course
    And Fill out the form to enroll in the course
    Then A page with confirmation opened
    #Проверка заполнения и отправки формы для курса Аналитик данных
  Scenario: Send a request for a Data Analitics course
    Given Open a page with Data Analitics courses
    And Choose SQL course
    And Choose Data Analitics course
    And Click on the button to enroll in the Data Analitics course
    And Fill out the form to enroll in the Data Analitics course
    Then Check that the confirmation page has opened
    #Проверка заполнения и отправки формы для курса Веб-дизайнер
  Scenario: Send a request for a WEB Designer course
    Given Open a page with Design courses
    And Choose WEB design course
    And Click on the button to enroll in the WEB Design course
    And Fill out the form to enroll in the WEB Design course
    Then Confirmation of successful sending has been received
