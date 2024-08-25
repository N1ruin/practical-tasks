package com.walking.lesson30_regex.task4;

/**
 * Реализуйте программу, разбивающую исходный текст на составные части.
 * Текст – на абзацы (разделены ‘\n’), абзацы на предложения (разделены "."/ "?"/ "?!"/ "!"/ "…").
 * Предложения на слова (разделены пробелами,
 * но также могут использоваться знаки препинания ","/ "-", ":").
 * <p>
 * После этого выведите на экран исходный текст.
 * Предложения допустимо разделить точками,
 * слова – пробелами без сохранения знаков пунктуации внутри предложения.
 * Сохранение изначальной пунктуации, на мой взгляд,
 * излишне усложнит задачу и сдвинет акцент с практики регулярных выражений.
 * <p>
 * Подумайте, как наиболее корректно декомпозировать ваше решение.
 */
public class Main {
    public static void main(String[] args) {
        String testText = " Однажды в лесу жил маленький Ёжик по имени Ёжик. Он был очень любопытным и всегда хотел знать больше о мире вокруг него. Однажды он решил отправиться на прогулку в лес.\n   Ёжик шел по лесу и наслаждался красотой природы. Он видел красивые цветы, слушал пение птиц и чувствовал свежий воздух. Внезапно он услышал странный звук. Ёжик остановился и прислушался. Он увидел, как белка пробежала мимо него.";
        System.out.println(testText);
    }
}
