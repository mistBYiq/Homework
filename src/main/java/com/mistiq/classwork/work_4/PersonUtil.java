package main.java.com.mistiq.classwork.work_4;

public class PersonUtil {

    private static final String[][] FIO_PERSON = {
            // [0][]
            {"Буслаев", "Колбягин", "Путилин", "Кулигин", "Яснеев", "Антиповский", "Болотников", "Глинка",
                    "Ядренников", "Шумилов"
            },
            // [1][]
            {"Фока", "Евстигней", "Иннокентий", "Мечислав", "Феликс", "Андрон", "Фадей", "Елизар", "Панкратий",
                    "Зиновий"
            },
            // [2][]
            {"Титович", "Федотович", "Иннокентиевич", "Тихонович", "Модестович", "Фролович", "Кириллович",
                    "Геннадиевич", "Федосиевич", "Кондратиевич"
            },
            // [3][]
            {"Кожевникова", "Крайнева", "Крестьянинова", "Гурская", "Юнге", "Полкова", "Никулаичева", "Кульчицкая",
                    "Мандрыка", "Яппарова"
            },
            // [4][]
            {"Виктория", "Всеслава", "Марфа", "Ираида", "Элеонора", "Владислава", "Дарья", "Тамара", "Марта",
                    "Анфиса"
            },
            // [5][]
            {"Клавдиевна", "Казимировна", "Михаиловна", "Максимовна", "Капитоновна", "Федотовна", "Рубеновна",
                    "Мечиславовна", "Феликсовна", "Олеговна"
            }
    };

    public static final String MAN = "MAN";
    public static final String WOMAN = "WOMAN";
    public static final int LAST_NAME_MAN_INDEX = 0;
    public static final int NAME_MAN_INDEX = 1;
    public static final int PATRONYMIC_MAN_INDEX = 2;
    public static final int LAST_NAME_WOMAN_INDEX = 3;
    public static final int NAME_WOMAN_INDEX = 4;
    public static final int PATRONYMIC_WOMAN_INDEX = 5;

    public static Person[] generatePersons(int value) {
        Person[] persons = new Person[value];
        for (int i = 0; i < value; i++) {
            persons[i] = generatePerson();
        }
        return persons;
    }

    public static Person generatePerson() {
        Person person = new Person();
        person.setGender(generateGender());
        person.setGender(generateGender());
        if (person.getGender().equals(MAN)) {
            person.setName(generateFio(NAME_MAN_INDEX));
            person.setLastName(generateFio(LAST_NAME_MAN_INDEX));
            person.setPatronymic(generateFio(PATRONYMIC_MAN_INDEX));
        } else {
            person.setName(generateFio(NAME_WOMAN_INDEX));
            person.setLastName(generateFio(LAST_NAME_WOMAN_INDEX));
            person.setPatronymic(generateFio(PATRONYMIC_WOMAN_INDEX));
        }
        person.setDateBirth(generateDateBirth());
        return person;
    }

    public static String generateGender() {
        if (random(0, 1) > 0) {
            return MAN;
        } else {
            return WOMAN;
        }
    }

    public static String generateFio(int firstIndex) {
        int length = FIO_PERSON[firstIndex].length;
        int secondIndex = (int) (Math.random() * length); //  [0; length)
        return FIO_PERSON[firstIndex][secondIndex];
    }

    public static Integer generateDateBirth() {
        return random(1950, 2000);
    }

    public static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
