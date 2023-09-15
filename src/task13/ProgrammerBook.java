package task13;

import task12_14_15.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int edition, String language, int level) {
        super(title, author, price, edition);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return "ProgrammerBook: " + super.toString() + ", language: " + language + ", level: " + level;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        ProgrammerBook other = (ProgrammerBook) obj;
        return level == other.level && language.equals(other.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }
}
