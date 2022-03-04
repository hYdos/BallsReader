package com.coping;

// Generated from C:/Users/AllOsSuck/Projects/MaldLoader/BallsReader/deeznuts\leftNut.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link leftNut}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface leftNutVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link leftNut#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(leftNut.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(leftNut.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(leftNut.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(leftNut.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(leftNut.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(leftNut.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(leftNut.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(leftNut.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(leftNut.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(leftNut.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(leftNut.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(leftNut.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(leftNut.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(leftNut.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(leftNut.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(leftNut.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(leftNut.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(leftNut.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(leftNut.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(leftNut.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(leftNut.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(leftNut.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(leftNut.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(leftNut.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(leftNut.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(leftNut.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(leftNut.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(leftNut.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(leftNut.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(leftNut.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(leftNut.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(leftNut.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(leftNut.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(leftNut.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceCommonBodyDeclaration(leftNut.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(leftNut.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(leftNut.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(leftNut.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(leftNut.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(leftNut.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(leftNut.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(leftNut.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(leftNut.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(leftNut.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(leftNut.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(leftNut.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(leftNut.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(leftNut.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#lambdaLVTIList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIList(leftNut.LambdaLVTIListContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIParameter(leftNut.LambdaLVTIParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(leftNut.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(leftNut.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(leftNut.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(leftNut.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAnnotationQualifiedName(leftNut.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(leftNut.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(leftNut.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(leftNut.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(leftNut.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(leftNut.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(leftNut.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(leftNut.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(leftNut.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(leftNut.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(leftNut.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(leftNut.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(leftNut.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(leftNut.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#recordDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDeclaration(leftNut.RecordDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#recordHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordHeader(leftNut.RecordHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#recordComponentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponentList(leftNut.RecordComponentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#recordComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponent(leftNut.RecordComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#recordBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordBody(leftNut.RecordBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(leftNut.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(leftNut.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(leftNut.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(leftNut.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(leftNut.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(leftNut.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(leftNut.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(leftNut.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(leftNut.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(leftNut.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(leftNut.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(leftNut.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(leftNut.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(leftNut.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(leftNut.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(leftNut.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(leftNut.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(leftNut.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(leftNut.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(leftNut.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(leftNut.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(leftNut.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(leftNut.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(leftNut.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(leftNut.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(leftNut.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#switchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpression(leftNut.SwitchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#switchLabeledRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabeledRule(leftNut.SwitchLabeledRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#guardedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardedPattern(leftNut.GuardedPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#switchRuleOutcome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchRuleOutcome(leftNut.SwitchRuleOutcomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(leftNut.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(leftNut.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(leftNut.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(leftNut.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(leftNut.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(leftNut.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(leftNut.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(leftNut.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(leftNut.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(leftNut.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(leftNut.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(leftNut.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(leftNut.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(leftNut.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(leftNut.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(leftNut.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link leftNut#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(leftNut.ArgumentsContext ctx);
}
