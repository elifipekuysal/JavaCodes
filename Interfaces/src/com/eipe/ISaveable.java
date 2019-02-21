package com.eipe;

import java.util.*;

public interface ISaveable {
    List save();
    void read(List<String> list);
}
