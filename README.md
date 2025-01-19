# Книга "Spring Быстро"

[Код из книги](https://manning-content.s3.amazonaws.com/download/a/32357a2-2420-4c0f-be67-645246ae0d94/code.zip)

## Часть I. Основные принципы - контекст и аспекты

### Глава 1. Spring в реальном мире

[Spring Start Here - Episode 1](https://www.youtube.com/watch?v=EhfUdb6do54)

### Глава 2. Контекст Spring: что такое бины

[Spring Start Here - Episode 2](https://www.youtube.com/watch?v=b8ocrkawS38)
[Spring Start Here - Episode 3](https://www.youtube.com/watch?v=uj9St3Rcehg)

Первое, что нужно освоить в Spring - добавление в контекст Spring экземпляров объектов (бинов). Spring "видит" только те объекты, которые были добавлены в контекст.

Контекст - место в памяти приложения, куда добавляются все экземпляры объектов, которыми должен управлять фреймворк.

Есть три способа добавления бинов в контекст Spring:
- аннотация @Bean (ветка: chapter_02)
- стереотипные аннотации (ветка: chapter_02-1)
- программным способом через registerBean() (ветка: chapter_02-2)
