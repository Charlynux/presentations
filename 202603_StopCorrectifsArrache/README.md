# Stop aux correctifs à l’arrache : Tester et comprendre avant de corriger

Présentation donnée pendant l'AmiensTechFestival 2026.

## Références

- [Things that sound fast, but are slow](https://www.industriallogic.com/blog/things-that-sound-fast-but-are-slow/)

## Tests

- I hate writing unit tests, how come everybody else - Colin Vipurs - Devoxx UK 2013 - [Lien](https://www.youtube.com/watch?v=MQWF7sKzu1w)
  - A voir si vous avez déjà un peu d'expérience avec les tests.
- Testing the untestable - Heroku - [Lien](https://www.rubyevents.org/talks/testing-the-untestable)
  - Comment une plateforme de déploiement auto à commencer à ajouter tardivement des tests ?
  - Commencer par des gros tests "end-to-end" puis introduire du test unitaire...
- Testing Minecraft in Minecraft | with Henrik Kniberg - [Lien](https://youtu.be/vXaWOJTCYNg?si=uc2uCYfBUaaOqP_g)
  - Une façon intéressante de considérer les tests.

## Gatling

- Les tests de charge sans être à côté de la plaque - Stéphane LANDELLE - [Vidéo](https://youtu.be/whpCF3lFuOE?si=83Ls-nizoRXyhQJY)
  - Une pres par le papa de Gatling, qui ne cite (presque) pas Gatling, mais parle de la théorie derrière les tests de charge.
- Load-testons M6+ pour préparer l’Euro 2024 ! - [Lien](https://youtu.be/NUwYlJjY3g4?si=UKHe7LTeogFvM9RD)
  - Retour d'expérience sur une utilisation réelle de Gatling
- 45 min pour mettre son application à genoux : le guide complet du test de charge - [Lien](https://youtu.be/rXYq4Mhe80M?si=Q1YkshU5ri0xe2g1)
  - Un bon guide pratique sur "Comment écrire des scripts Gatling ?"

## OpenTelemetry

- Site officiel - [Lien](https://opentelemetry.io/)
- Java Agent OpenTelemetry - [Lien](https://opentelemetry.io/docs/languages/java/getting-started/#instrumentation)
  - Permet de "magiquement" générer les traces de vos appels HTTPs, accès à la BDD
- Zipkin - [Lien](https://zipkin.io/)
  - Une solution pour récupérer ses traces avec un simple "java -jar"
