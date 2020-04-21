# Coding-Gym-Java

Задача 0: Вернуть объект, содержащий массив key-value значений(key = string, value - frequency), отсортированные по значению.Функция countStrings(..) должна вернуть [b: 3, a: 2, c: 1]

Задачи по Stream API, Collectors

	1) Вывести список персон (Ответ: [Max, Billy, John, Antony]) 
	2) Вывести всех сотрудников, которые работали в EPAM (Ответ: [Max, Billy, John]
	3) Вывести первых двух сотрудников как отображение Имя=Зарплата (Ответ: {Billy=160000, Max=100000})
	4) Вывести сотрудников, отсортированных по возрасту (Ответ: [Antony, John, Max, Billy])
	5) Вывести отображение сотрудников с максимальной и минимальной зарплатой min=имя_сотрудника, max=имя_сотрудника
			Ответ({min=Max, max=Antony})
	6) Вывести отображение сотрудников, чьи зарплаты > 150000,
		сгруппировав их по зарплате и указав кто из начал карьеру в яндексе 
		(Ответ: {big zp={160000=[Billy, John], 240000=[Antony]}, from yandex=[Billy, Antony]})
	7) Вывести сотрудников, сгруппированных по первым компаниям, в которых они работали 
		 в совокупности и выведите как отображение имя_компании: имя_сотрудника and имя_сотрудника и т.д. (всех кто там работал)
	Ответ:  yandex: Billy and Antony and Tom
            epam: Max and John
            netflix: Sasha
            ITU-T: Kevin)