/**
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

 java import.util.Список массивов;
java import.util.Итератор;
импорт java .util.List;
java import.util.Случайный;

задача  2 класс  общедоступный {

    Статический публичный список  <Целое число> getRandomList() {
        случайный  случайный = новый  случайный();
        размер  int = 20;
        Список<Целое число> список = новый  список массивов<>(размер);
        для (int  i = 0; i < size; i++) {
            список.добавить(random.nextInt(100));
        }
        System.out.println(список.toString());
        возврат списка ;
    }

    Список  статических  общедоступных<Целое число> deletEvenNum(Список <Целое число> список) {

        для (Итератор<Целое число> итератор = list.iterator(); итератор.hasNext();) {
            целое число  = iterator.next();
            если (число % 2 == 0) {
                итератор.remove();
            }

        }
        System.out.println(список.toString());
        возврат списка ;
    }

    main  аннулирует  статический  публичный(строка[] аргументов) {
        Удалить значение (getRandomList());
    }
}
