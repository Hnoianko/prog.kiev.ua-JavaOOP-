package com.gmail.gnoianko;

import java.io.*;

public class BaseGroup {
    private String fileAddress;

    public BaseGroup(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public BaseGroup() {
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public void saveGroup(Group group) {
        try (ObjectOutput os = new ObjectOutputStream(new FileOutputStream(fileAddress))) {
            os.writeObject(group);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Group loadGroup() {
        try (ObjectInput oi = new ObjectInputStream(new FileInputStream(fileAddress))) {
            return (Group) oi.readObject();
        } catch (IOException | ClassCastException | ClassNotFoundException e) {
            return null;
        }
    }
}
