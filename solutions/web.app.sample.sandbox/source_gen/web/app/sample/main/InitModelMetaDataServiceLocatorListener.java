package web.app.sample.main;

/*Generated by MPS */

import jetbrains.springframework.configuration.runtime.ServiceLocatorAdapter;
import jetbrains.teamsys.dnq.runtime.util.DnqUtils;

public class InitModelMetaDataServiceLocatorListener extends ServiceLocatorAdapter {
  public void onAfterInit() {
    DnqUtils.initModelMetaData(false);
  }
}
