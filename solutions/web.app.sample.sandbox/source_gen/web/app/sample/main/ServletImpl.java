package web.app.sample.main;

/*Generated by MPS */

import jetbrains.mps.webr.runtime.servlet.MainServlet;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import jetbrains.springframework.configuration.runtime.ServiceLocator;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import webr.framework.controller.WebClasspathXmlServiceLocator;
import webr.framework.url.UrlUtil;

public class ServletImpl extends MainServlet {
  protected static Log log = LogFactory.getLog(ServletImpl.class);

  public void init() throws ServletException {
    this.startInit();
    final ServletConfig config = this.getServletConfig();
    try {
      synchronized (ServiceLocator.class) {
        if (!(ServiceLocator.isInited())) {
          {
            List<String> sources = ListSequence.fromList(new ArrayList<String>());
            ListSequence.fromList(sources).addElement("classpath*:**/*Configuration.xml");
            ServiceLocator.init(new WebClasspathXmlServiceLocator(ListSequence.fromList(sources).toGenericArray(String.class), false));
          }
        }
      }
    } catch (RuntimeException e) {
      if (log.isErrorEnabled()) {
        log.error("Can't init servlet", e);
      }
      ServiceLocator.close();
      throw e;
    }
    if (log.isDebugEnabled()) {
      log.debug("Application inited");
    }
    super.init();
    this.endInit();
  }

  public void destroy() {
    this.startDestory();
    ServiceLocator.close();
    this.endDestroy();
    if (log.isDebugEnabled()) {
      log.debug("Application destroyed");
    }
  }

  protected String getIndexUri() {
    return UrlUtil.getHtmlTemplateUri("MessageBoard", "");
  }
}
