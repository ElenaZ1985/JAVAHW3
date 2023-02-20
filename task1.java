/**
 * Реализовать алгоритм сортировки слиянием
 */

java import.util.Массивы;
java import.util.Случайный;

задача  1 открытый класс  {

    main  аннулирует  статический  публичный(строка[] аргументов) {
        <span>int</span>[] <span>array1</span> = <span>randomArr</span>();
        int[] результат = сортировка слиянием(array1);
        System.out.println(Arrays.toString(результат));
    }

    int static public[] randomArr() {
        рандомный  = новый  случайный();
        arr  int[] = новый  int[10];
        для (int  i = 0; i < arr.length; i++) {
            arr[i] = ранд.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        возвращение arr ;
    }

    <span>int</span><span> static</span><span> public</span>[] <span>сортировка</span> слиянием(<span>int</span>[] <span>array1</span>) {  
        <span>int</span>[] <span>buffer1</span> = <span>Массивы</span>.<span>copyOf</span>(<span>массив1</span>, <span>массив1</span>.<span>длина</span>);
        <span>int</span>[] <span>buffer2</span> = <span>новый</span><span> int</span>[<span>array1</span>.<span>length</span>]; 
        <span>int</span>[] <span>результат</span> = <span>mergesortInner</span>(<span>buffer1</span>, <span>buffer2</span>, <span>0</span>, <span>array1</span>.<span>length</span>);
        <span>возврат результата</span><span></span>; 
    }

    <span>int</span><span>static</span><span>public</span>[] <span>mergesortInner</span>(<span>int</span>[] <span>buffer1</span>, <span>int</span>[] <span>buffer2</span>,  
            <span>Начальный индекс int</span><span></span>, конечный индекс <span>int</span><span></span>) {  
        <span>если</span> (<span>startIndex</span> >= <span>endIndex</span> - <span>1</span>) {
            <span>возврат</span><span></span> буфера1; 
        }

        <span>средний</span><span> int</span> = <span>startIndex</span> + (<span>endIndex</span> - <span>startIndex</span>) / <span>2</span>; 
        <span>int</span>[] <span>сортировка1</span> = <span>сортировщик</span> слияний(<span>buffer1</span>, <span>buffer2</span>, <span>startIndex</span>, <span>средний</span>);
        <span>int</span>[] <span>сортировка2</span> = <span>сортировщик</span> слияний(<span>buffer1</span>, <span>buffer2</span>, <span>middle</span>, <span>endIndex</span>);

        <span>index1</span><span>int</span> = <span>startIndex</span>; 
        index2  int = средний;
        destIndex int = startIndex;
        int[] результат = сортировка1 == буфер1 ? buffer2 : buffer1;
        в то время как (index1 <средний && index2 < Конечный индекс) {
            результат[destIndex++] = сортировка1[индекс1] < сортировка2[индекс2]
 ? сортировка1[index1++]
 : сортировка 2[index2++];
        }
        в то время как (index1 < средний) {
            результат[destIndex++] = сортировка1[index1++];
        }
        в то время как (index2 < endIndex) {
            результат[destIndex++] = сортировка2[index2++];
        }
        возврат результата ;
    }

}
