package web.app.sample.main;

/*Generated by MPS */

import jetbrains.mps.webr.runtime.templateComponent.ITemplateFactory;
import jetbrains.mps.webr.runtime.templateComponent.TemplateComponent;
import java.util.Map;

public class Board_HtmlTemplateFactory implements ITemplateFactory {
  public Board_HtmlTemplateFactory() {
  }

  public TemplateComponent create() {
    return new Board_HtmlTemplateComponent();
  }

  public TemplateComponent create(TemplateComponent parent, String name, Map<String, Object> params) {
    return new Board_HtmlTemplateComponent(parent, name, params);
  }
}
