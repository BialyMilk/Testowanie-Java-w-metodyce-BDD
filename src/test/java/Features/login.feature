Feature: Logowanie do aplikacji

  Jako użytkownik, chcę mieć funkcjonolność logowania do aplikacji w celu korzystania z jego zaawansowanych opcji

  @now
  Scenario: Poprwne logowanie do aplikacji
    Given Uzytkownik jest na stronie logowania
    When Uzytkownik w pole username wprowadza poprawna nazwe uzytkownika
    And Uzytkownik wprowadza w pole password poprawne haslo
    And Uzytkownik klika w przycisk Login
    Then Uzytkownik zostaje poprawnie zalogowany

    @now
  Scenario: Niepoprawne logowanie
    Given Uzytkownik jest na stronie logowania2
    When Uzytkownik w pole username wprowadza poprawna nazwe uzytkownika2
    And Uzytkownik wprowadza w pole password niepoprawne haslo
    And Uzytkownik klika w przycisk Login2
    Then Uzytkownik nie zostaje poprawnie zalogowany