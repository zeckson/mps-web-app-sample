<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:9f4316a1-4bc9-4691-b28a-19b434b5a6b9(web.app.sample.sandbox.persistence)">
  <persistence version="7" />
  <language namespace="ed6d7656-532c-4bc2-81d1-af945aeb8280(jetbrains.mps.baseLanguage.blTypes)" />
  <language namespace="cccc689c-f365-4862-a8b6-34ecddf8ee26(jetbrains.mps.baseLanguage.dates)" />
  <language namespace="dccc2f36-96dc-4be7-81db-dbac70f263d8(jetbrains.springframework.configurationInternal)" />
  <language namespace="9ded098b-ad6a-4657-bfd9-48636cfe8bc3(jetbrains.mps.lang.traceable)" />
  <language namespace="56161633-d5ae-44a4-afd8-39965c333e25(jetbrains.teamsys.dnq)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="55ab425d-e41c-4e70-80ad-83e065232635(jetbrains.mps.baseLanguageExt)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="1991585e-225e-4371-977a-68a7888adae2(jetbrains.mps.baseLanguage.datesInternal)" />
  <language namespace="e4957dbb-a743-4c21-b4db-31d0ecdff5f7(jetbrains.springframework.configuration)" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="op11" modelUID="r:45000d24-3601-442a-a1e1-b26727c8fcdc(jetbrains.teamsys.dnq.structure)" version="1" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="4" implicit="yes" />
  <roots>
    <node type="op11.PersistentClassConcept" typeId="op11.1164197385983" id="3674256961799735806">
      <property name="autoRemoveOrphan" nameId="op11.1182249041600" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="Message" />
    </node>
    <node type="op11.PersistentClassConcept" typeId="op11.1164197385983" id="3674256961799735808">
      <property name="autoRemoveOrphan" nameId="op11.1182249041600" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="User" />
    </node>
  </roots>
  <root id="3674256961799735806">
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="3674256961799905081">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3674256961799905082" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3674256961799905083" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3674256961799905084" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="op11.DirectedAssociationEnd" typeId="op11.1171530305683" id="3674256961799744719">
      <property name="name" nameId="tpck.1169194664001" value="author" />
      <property name="cardinality" nameId="op11.1171359707564" value="1" />
      <link role="association" roleId="op11.1171396421074" targetNodeId="3674256961799744722" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3674256961799744720" />
      <node role="storedAssociation" roleId="op11.4151497511681701198" type="op11.DirectedAssociation" typeId="op11.1171402807641" id="3674256961799744722">
        <link role="sourceEnd" roleId="op11.1171402826236" targetNodeId="3674256961799744719" resolveInfo="author" />
        <link role="targetEnd" roleId="op11.1171402819657" targetNodeId="3674256961799735808" resolveInfo="User" />
      </node>
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3674256961799744724">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="3674256961799735808" resolveInfo="User" />
      </node>
      <node role="constraint" roleId="op11.1175513501222" type="op11.OnTargetDeleteConstraint" typeId="op11.1229681507482" id="3674256961799744725" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="op11.SimpleProperty" typeId="op11.1164197014369" id="3674256961799744729">
      <property name="name" nameId="tpck.1169194664001" value="content" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3674256961799744730" />
      <node role="type" roleId="tpee.5680397130376446158" type="op11.TextType" typeId="op11.1174934220231" id="3674256961799744733" />
      <node role="constraint" roleId="op11.1172498279794" type="op11.FixedNewlinesConstraint" typeId="op11.1206725651793" id="3674256961799744734" />
      <node role="constraint" roleId="op11.1172498279794" type="op11.RequiredConstraint" typeId="op11.1172498215537" id="3674256961799744736" />
    </node>
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3674256961799735807" />
  </root>
  <root id="3674256961799735808">
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="3674256961799750996">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3674256961799750997" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3674256961799750998" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3674256961799750999">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3674256961799751002">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3674256961799751020">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3674256961799751023">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3674256961799751000" resolveInfo="username" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3674256961799751003">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3674256961799735813" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3674256961799751000">
        <property name="name" nameId="tpck.1169194664001" value="username" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="3674256961799751001" />
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="op11.SimpleProperty" typeId="op11.1164197014369" id="3674256961799735813">
      <property name="name" nameId="tpck.1169194664001" value="name" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3674256961799735814" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="3674256961799735816" />
      <node role="constraint" roleId="op11.1172498279794" type="op11.UniqueConstraint" typeId="op11.1172498179557" id="3674256961799744713" />
      <node role="constraint" roleId="op11.1172498279794" type="op11.RequiredConstraint" typeId="op11.1172498215537" id="3674256961799744715" />
    </node>
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3674256961799735809" />
  </root>
</model>

