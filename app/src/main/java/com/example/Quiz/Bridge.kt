package com.example.Quiz

internal object Bridge {
     var questionsList = mutableListOf(
        Question("1. Какой праздник отмечается 4 ноября?\n" +
                "\n" +
                "a. День флага России\n" +
                "b. Дань независимости\n" +
                "c. День народного единства", 3),
        Question("2. Какой ещё праздник отмечается в этот день?\n" +
                "\n" +
                "a. Праздник в честь иконы Казанской Божьей матери\n" +
                "b. Праздник в честь освобождения Руси\n" +
                "c. Праздник многонациональности России", 1),
        Question("3. В честь какого события празднуется День народного единства?\n" +
                "\n" +
                "a. Освобождение Москвы от польских захватчиков\n" +
                "b. Объединение народа\n" +
                "c. Появление России, как единого государства\n", 1),
        Question("4. Кто является героями данного праздника?\n" +
                "\n" +
                "a. Все люди\n" +
                "b. Вся страна\n" +
                "c. Минин и Пожарский", 3),
        Question("5. В каком году начали отмечать День народного единства в России?\n" +
                "\n" +
                "a. 2001\n" +
                "b. 2005\n" +
                "c. 2008", 2),
        Question("6. Основным событием праздника в 2005 году стало?\n" +
                "\n" +
                "a. Открытие памятника Минину и Пожарскому в Нижнем Новгороде\n" +
                "b. Праздничные крестные ходы\n" +
                "c. Возложение венков президента России к памятнику Минина и Пожарского в Москве", 1),
        Question("7. Какой похожий праздник отмечался в начале ноября до 2005 года?\n" +
                "\n" +
                "a. День всемирного наследия\n" +
                "b. День распада СССР\n" +
                "c. День согласия и примирения", 3),
        Question("8. В каком городе староста Кузьма Минин начал призыв к объединению и созданию ополчения, для освобождения от польских захватчиков?\n" +
                "\n" +
                "a. Москва\n" +
                "b. Нижний Новгород\n" +
                "c. Владимир", 2),
        Question("9. Кем был в этом ополчении Дмитрий Пожарский?\n" +
                "\n" +
                "a. Казначеем\n" +
                "b. Предводителем\n" +
                "c. Воеводой", 3),
        Question("\n" +
                "10. Закончите пословицу: «Когда мы едины…»\n" +
                "\n" +
                "a. … - мы непобедимы!\n" +
                "b. … - мы горы свернём!\n" +
                "c. … - нет нам равных!", 1),
    )
}