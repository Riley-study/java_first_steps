package org.example;

import java.util.Objects;

public class Notebook {
    int randomAccessMemory;
    int hardDriveCapacity;
    String operatingSystem;
    String color;
    int noteId;

    public Notebook(int noteId, String operatingSystem, int randomAccessMemory, int hardDriveCapacity, String color) {
        this.randomAccessMemory = randomAccessMemory;
        this.hardDriveCapacity = hardDriveCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.noteId = noteId;
    }

    @Override
    public String toString() {
        StringBuilder noteToPrint = new StringBuilder();
        noteToPrint.append("(Notebook ID ").append(noteId).append(" - ").append(operatingSystem).append(" ").append(randomAccessMemory).append(" Гб, ")
                .append(hardDriveCapacity).append(" Гб, ").append(color).append(")");
        return noteToPrint.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(operatingSystem, randomAccessMemory, hardDriveCapacity, color);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Notebook)){
            return false;
        }
        Notebook temp = (Notebook) obj;
        return temp.color == this.color && temp.hardDriveCapacity == this.hardDriveCapacity && temp.noteId == this.noteId
               && temp.operatingSystem == this.operatingSystem && temp.randomAccessMemory == this.randomAccessMemory;
    }
}
