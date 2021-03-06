package web.app.sample.main;

/*Generated by MPS */

import jetbrains.mps.webr.runtime.templateComponent.TemplateComponent;
import java.util.Map;
import jetbrains.mps.webr.runtime.templateComponent.TemplateActionController;
import webr.framework.textBuilder.TBuilderContext;
import jetbrains.mps.webr.runtime.util.ParameterUtil;
import jetbrains.mps.webr.htmlComponent.runtime.HtmlComponentUtil;
import webr.framework.function.HtmlStringUtil;
import jetbrains.exodus.entitystore.Entity;
import jetbrains.teamsys.dnq.runtime.queries.QueryOperations;
import com.jetbrains.teamsys.dnq.association.PrimitiveAssociationSemantics;
import com.jetbrains.teamsys.dnq.association.AssociationSemantics;

public class Board_HtmlTemplateComponent extends TemplateComponent {
  public Board_HtmlTemplateComponent(TemplateComponent parentTemplateComponent, String templateName, Map<String, Object> templateParameters) {
    super(null, parentTemplateComponent, templateName, templateParameters);
  }

  public Board_HtmlTemplateComponent(TemplateComponent parentTemplateComponent, String templateName) {
    super(null, parentTemplateComponent, templateName);
  }

  public Board_HtmlTemplateComponent(TemplateActionController templateActionController, String templateName, Map<String, Object> templateParameters) {
    super(templateActionController, null, templateName, templateParameters);
  }

  public Board_HtmlTemplateComponent(TemplateActionController templateActionController, TemplateComponent parentTemplateComponent, String templateName, Map<String, Object> templateParameters) {
    super(templateActionController, parentTemplateComponent, templateName, templateParameters);
  }

  public Board_HtmlTemplateComponent(Map<String, Object> templateParameters) {
    super(null, null, "Board", templateParameters);
  }

  public Board_HtmlTemplateComponent() {
    super(null, null, "Board");
  }

  protected void renderTemplate(Map<String, Object> rootMap, final TBuilderContext builderContext) {
    {
      String id = ParameterUtil.getParameterString("id", builderContext.getCurrentTemplateComponent().getFullLabeledInputName("board"));
      this.setRefreshElementId(id);
      if (this.tryRenderHidden(rootMap, builderContext, id)) {
        return;
      }
    }
    builderContext.appendIndent();
    builderContext.append("<div");
    builderContext.append(" cn=\"");
    builderContext.append(builderContext.getCurrentTemplateComponent().getRefPath("board"));
    builderContext.append("\"");
    HtmlComponentUtil.addTemplateParamAttributes(builderContext);
    builderContext.append(" id=\"");
    builderContext.append(HtmlStringUtil.html(builderContext.checkId("id", builderContext.getCurrentTemplateComponent().getFullLabeledInputName("board"))));
    builderContext.append("\"");
    builderContext.append(">");
    builderContext.appendNewLine();
    builderContext.increaseIndent();
    for (Entity message : QueryOperations.queryGetAll("Message")) {
      builderContext.appendIndent();
      builderContext.append("<div");
      builderContext.append(">");
      builderContext.appendNewLine();
      builderContext.increaseIndent();
      builderContext.appendIndent();
      builderContext.append("<span");
      builderContext.append(">");
      builderContext.appendNewLine();
      builderContext.increaseIndent();
      builderContext.appendIndent();
      builderContext.append("Author: ");
      builderContext.append(HtmlStringUtil.html(PrimitiveAssociationSemantics.get(AssociationSemantics.getToOne(message, "author"), "name", String.class, null)));
      builderContext.append(":");
      builderContext.appendNewLine();
      builderContext.decreaseIndent();
      builderContext.appendIndent();
      builderContext.append("</span>");
      builderContext.appendNewLine();
      builderContext.appendIndent();
      builderContext.append("<span");
      builderContext.append(">");
      builderContext.append(HtmlStringUtil.html((PrimitiveAssociationSemantics.getBlobAsString(message, "content"))));
      builderContext.append("</span>");
      builderContext.appendNewLine();
      builderContext.decreaseIndent();
      builderContext.appendIndent();
      builderContext.append("</div>");
      builderContext.appendNewLine();
    }
    builderContext.decreaseIndent();
    builderContext.appendIndent();
    builderContext.append("</div>");
    builderContext.appendNewLine();
  }
}
