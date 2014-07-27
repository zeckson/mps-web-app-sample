<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:707ef7cb-d770-483f-8b8d-ba3f6848f40e(jetbrains.mps.web.sample.persistence)">
  <persistence version="8" />
  <language namespace="ed6d7656-532c-4bc2-81d1-af945aeb8280(jetbrains.mps.baseLanguage.blTypes)" />
  <language namespace="443f4c36-fcf5-4eb6-9500-8d06ed259e3e(jetbrains.mps.baseLanguage.classifiers)" />
  <language namespace="dccc2f36-96dc-4be7-81db-dbac70f263d8(jetbrains.springframework.configurationInternal)" />
  <language namespace="9ded098b-ad6a-4657-bfd9-48636cfe8bc3(jetbrains.mps.lang.traceable)" />
  <language namespace="56161633-d5ae-44a4-afd8-39965c333e25(jetbrains.teamsys.dnq)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="a20adb12-cde0-4a3a-bc3e-c072aa484055(jetbrains.mps.baseLanguage.stateMachine)" />
  <language namespace="55ab425d-e41c-4e70-80ad-83e065232635(jetbrains.mps.baseLanguageExt)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="e4957dbb-a743-4c21-b4db-31d0ecdff5f7(jetbrains.springframework.configuration)" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="op11" modelUID="r:45000d24-3601-442a-a1e1-b26727c8fcdc(jetbrains.teamsys.dnq.structure)" version="1" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="5" implicit="yes" />
  <root type="op11.PersistentClassConcept" typeId="op11.1164197385983" id="1032868160762299144" nodeInfo="ig">
    <property name="autoRemoveOrphan" nameId="op11.1182249041600" value="true" />
    <property name="name" nameId="tpck.1169194664001" value="Record" />
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="1032868160762346571" nodeInfo="ig">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="1032868160762346572" nodeInfo="in" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1032868160762346573" nodeInfo="nn" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1032868160762346574" nodeInfo="sn" />
    </node>
    <node role="member" roleId="tpee.5375687026011219971" type="op11.SimpleProperty" typeId="op11.1164197014369" id="1032868160762305539" nodeInfo="igu">
      <property name="name" nameId="tpck.1169194664001" value="username" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1032868160762305541" nodeInfo="nn" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="1032868160762306610" nodeInfo="in" />
      <node role="constraint" roleId="op11.1172498279794" type="op11.RequiredConstraint" typeId="op11.1172498215537" id="1032868160762346326" nodeInfo="ng" />
      <node role="constraint" roleId="op11.1172498279794" type="op11.UniqueConstraint" typeId="op11.1172498179557" id="1032868160762346383" nodeInfo="ng" />
    </node>
    <node role="member" roleId="tpee.5375687026011219971" type="op11.SimpleProperty" typeId="op11.1164197014369" id="1032868160762346479" nodeInfo="igu">
      <property name="name" nameId="tpck.1169194664001" value="message" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1032868160762346481" nodeInfo="nn" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="1032868160762346506" nodeInfo="in" />
      <node role="constraint" roleId="op11.1172498279794" type="op11.RequiredConstraint" typeId="op11.1172498215537" id="1032868160762346557" nodeInfo="ng" />
    </node>
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1032868160762299145" nodeInfo="nn" />
  </root>
</model>

