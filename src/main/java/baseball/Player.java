package baseball;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Integer> numbers;

    Player() {
        this.numbers = new ArrayList<>();
    }

    Player(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void changeNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}