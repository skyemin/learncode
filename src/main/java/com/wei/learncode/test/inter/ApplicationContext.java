package com.wei.learncode.test.inter;

import java.util.List;

public interface ApplicationContext extends ListableBeanFactory {

    String getApplicationName();
}
