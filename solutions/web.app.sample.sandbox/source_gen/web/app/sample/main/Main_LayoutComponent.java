package web.app.sample.main;

/*Generated by MPS */

import jetbrains.mps.webr.runtime.templateComponent.LayoutComponent;
import jetbrains.mps.webr.runtime.templateComponent.TemplateActionController;
import java.util.Map;
import webr.framework.textBuilder.TBuilderContext;
import webr.framework.function.HtmlStringUtil;
import jetbrains.mps.webr.runtime.templateComponent.LinkUtil;
import webr.framework.url.UrlUtil;
import jetbrains.mps.webr.runtime.requestProcessor.MimeType;
import jetbrains.mps.webr.javascript.runtime.escape.JsStringUtil;
import webr.framework.controller.BaseApplication;
import jetbrains.mps.webr.runtime.templateComponent.TemplateComponent;
import jetbrains.mps.webr.htmlComponent.runtime.HtmlComponentUtil;

public class Main_LayoutComponent extends LayoutComponent {
  public Main_LayoutComponent(TemplateActionController actionController, Map<String, Object> templateParameters) {
    super("l", actionController, templateParameters);
  }

  protected void renderTemplate(Map<String, Object> rootMap, final TBuilderContext builderContext) {
    builderContext.appendIndent();
    builderContext.append("<!DOCTYPE html");
    builderContext.appendNewLine();
    builderContext.increaseIndent();
    builderContext.decreaseIndent();
    builderContext.appendIndent();
    builderContext.append(">");
    builderContext.appendNewLine();
    builderContext.append("<html>");
    builderContext.appendNewLine();
    builderContext.increaseIndent();
    builderContext.appendIndent();
    builderContext.append("<head>");
    builderContext.appendNewLine();
    builderContext.increaseIndent();
    builderContext.appendIndent();
    builderContext.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\"/>");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.append("<title>");
    builderContext.append(HtmlStringUtil.html(((String) builderContext.getCurrentTemplateComponent().getTemplateParameters().get("title"))));
    builderContext.append("</title>");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.append("");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.append("<!--css-->");
    builderContext.appendNewLine();
    builderContext.startContentBlock("__CSS__");
    builderContext.endContentBlock();
    if (builderContext.hasTemplateStylesheet()) {
      builderContext.startContentBlock("__CSS__");
      LinkUtil.addStylesheetLink(builderContext, UrlUtil.getDeferredResourceUri(builderContext.getTemplateStylesheetPath()));
      builderContext.endContentBlock();
    }
    LinkUtil.addInitialCssDependencies(builderContext);
    // TODO:optimize
    LinkUtil.insertLinkToBundle(MimeType.TEXT_CSS.getPresentation());
    builderContext.addContentPlaceholder("__CSS__");
    builderContext.appendIndent();
    builderContext.append("");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.append("");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.append("<meta name=\"viewport\" content=\"initial-scale=1.0\"/>");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.append("<meta name=\"_meta_template_name\" content=\"");
    builderContext.append(HtmlStringUtil.html(builderContext.getCurrentTemplateName()));
    builderContext.append("\"/>");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.append("<meta name=\"_meta_layout_name\" content=\"");
    builderContext.append(HtmlStringUtil.html(builderContext.getCurrentLayoutName()));
    builderContext.append("\"/>");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.append("<!--js-->");
    builderContext.appendNewLine();
    LinkUtil.addInitialScriptDependencies(builderContext);
    // TODO:optimize
    LinkUtil.insertLinkToBundle(MimeType.TEXT_JAVASCRIPT.getPresentation());
    builderContext.addContentPlaceholder("__JAVASCRIPT__");
    builderContext.appendIndent();
    builderContext.append("");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.append("<script type=\"text/javascript\"");
    builderContext.append(LinkUtil.DEFER_STRING);
    builderContext.append(">");
    builderContext.appendIndent();
    builderContext.appendIndent();
    builderContext.append("Webr.Event.handlerUrl = \"");
    builderContext.append(JsStringUtil.stringLiteral(UrlUtil.getHandlerUrl(builderContext)));
    builderContext.append("\";");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.append("Webr.Event.sessionId = \"");
    builderContext.append(JsStringUtil.stringLiteral((BaseApplication.getRequest().getSession() == null ?
      "" :
      BaseApplication.getRequest().getSession().getId()
    )));
    builderContext.append("\";");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.append("Webr.Event.rootUrl = \"");
    builderContext.append(JsStringUtil.stringLiteral(UrlUtil.getRootURI()));
    builderContext.append("\";");
    builderContext.appendNewLine();
    builderContext.appendNewLine();
    builderContext.append("</script>");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.append("");
    builderContext.appendNewLine();
    builderContext.appendIndent();
    builderContext.appendNewLine();
    builderContext.startContentBlock("__JAVASCRIPT_CONTENT__");
    builderContext.appendIndent();
    builderContext.append("Webr.HeartBeat.init();");
    builderContext.appendNewLine();
    builderContext.endContentBlock();
    builderContext.decreaseIndent();
    builderContext.appendIndent();
    builderContext.append("</head>");
    builderContext.appendNewLine();
    builderContext.flush();
    builderContext.appendIndent();
    builderContext.append("<body>");
    builderContext.appendNewLine();
    builderContext.increaseIndent();
    builderContext.appendIndent();
    {
      TemplateComponent childTemplateComponent;
      childTemplateComponent = this.getNestedTemplateComponent();
      TemplateComponent currentTemplateComponent = builderContext.getCurrentTemplateComponent();
      if (currentTemplateComponent != null) {
        currentTemplateComponent.addChildTemplateComponent(childTemplateComponent.getTemplateName(), childTemplateComponent);
      }
      TemplateComponent.buildTemplateComponent(childTemplateComponent, builderContext);
    }
    builderContext.appendNewLine();
    // template paths should be added strickly before other scripts inside placeholder!
    HtmlComponentUtil.addTemplatePaths(builderContext);
    HtmlComponentUtil.addResponseTimeJs(builderContext);
    builderContext.flush();
    builderContext.appendIndent();
    builderContext.append("<script type=\"text/javascript\"");
    builderContext.append(LinkUtil.DEFER_STRING);
    builderContext.append(">");
    builderContext.appendIndent();
    builderContext.appendIndent();
    builderContext.append("$(document).ready(function () {");
    builderContext.appendNewLine();
    builderContext.increaseIndent();
    builderContext.appendIndent();
    builderContext.addContentPlaceholder("__JAVASCRIPT_CONTENT__");
    builderContext.appendNewLine();
    builderContext.decreaseIndent();
    builderContext.appendIndent();
    builderContext.append("});");
    builderContext.appendNewLine();
    builderContext.appendNewLine();
    builderContext.append("</script>");
    builderContext.appendNewLine();
    builderContext.decreaseIndent();
    builderContext.appendIndent();
    builderContext.append("</body>");
    builderContext.appendNewLine();
    builderContext.decreaseIndent();
    builderContext.appendIndent();
    builderContext.append("</html>");
  }

  protected void doBuildComponentTree(Map<String, Object> rootMap, final TBuilderContext builderContext) {
    {
      TemplateComponent childTemplateComponent;
      childTemplateComponent = this.getNestedTemplateComponent();
      TemplateComponent.buildComponentTree(childTemplateComponent, builderContext);
    }
  }
}
