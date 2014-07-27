cr.setTemplateBind("MessageBoard", function (path) {
  cr.ach(path, "sendButton", "click", function (event, data) {
    if (cr.findInHandler(event, "" + "." + "message", []).value.length === 0) {
      window.alert("Cannot send empty message");
      return false;
    }

    cr.serverMethodCallInHandler(event, "" + "." + "methodCall_saveMessage", {}, {collectFormElements: true, preventDoubleSubmit: true});
  });
});
