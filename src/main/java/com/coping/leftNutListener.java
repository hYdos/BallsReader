package com.coping;

// Generated from C:/Users/AllOsSuck/Projects/MaldLoader/BallsReader/deeznuts\leftNut.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link leftNut}.
 */
public interface leftNutListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link leftNut#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(leftNut.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(leftNut.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(leftNut.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(leftNut.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(leftNut.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(leftNut.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(leftNut.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(leftNut.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(leftNut.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(leftNut.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(leftNut.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(leftNut.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(leftNut.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(leftNut.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(leftNut.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(leftNut.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(leftNut.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(leftNut.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(leftNut.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(leftNut.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(leftNut.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(leftNut.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(leftNut.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(leftNut.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(leftNut.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(leftNut.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(leftNut.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(leftNut.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(leftNut.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(leftNut.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(leftNut.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(leftNut.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(leftNut.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(leftNut.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(leftNut.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(leftNut.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(leftNut.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(leftNut.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(leftNut.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(leftNut.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(leftNut.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(leftNut.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(leftNut.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(leftNut.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(leftNut.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(leftNut.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(leftNut.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(leftNut.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(leftNut.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(leftNut.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(leftNut.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(leftNut.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(leftNut.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(leftNut.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(leftNut.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(leftNut.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(leftNut.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(leftNut.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(leftNut.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(leftNut.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(leftNut.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(leftNut.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(leftNut.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(leftNut.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(leftNut.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(leftNut.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(leftNut.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(leftNut.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceCommonBodyDeclaration(leftNut.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceCommonBodyDeclaration(leftNut.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(leftNut.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(leftNut.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(leftNut.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(leftNut.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(leftNut.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(leftNut.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(leftNut.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(leftNut.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(leftNut.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(leftNut.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(leftNut.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(leftNut.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(leftNut.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(leftNut.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(leftNut.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(leftNut.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(leftNut.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(leftNut.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(leftNut.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(leftNut.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(leftNut.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(leftNut.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(leftNut.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(leftNut.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(leftNut.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(leftNut.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIList(leftNut.LambdaLVTIListContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIList(leftNut.LambdaLVTIListContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIParameter(leftNut.LambdaLVTIParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIParameter(leftNut.LambdaLVTIParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(leftNut.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(leftNut.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(leftNut.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(leftNut.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(leftNut.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(leftNut.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(leftNut.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(leftNut.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterAltAnnotationQualifiedName(leftNut.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitAltAnnotationQualifiedName(leftNut.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(leftNut.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(leftNut.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(leftNut.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(leftNut.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(leftNut.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(leftNut.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(leftNut.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(leftNut.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(leftNut.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(leftNut.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(leftNut.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(leftNut.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(leftNut.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(leftNut.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(leftNut.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(leftNut.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(leftNut.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(leftNut.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(leftNut.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(leftNut.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(leftNut.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(leftNut.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(leftNut.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(leftNut.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(leftNut.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(leftNut.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(leftNut.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(leftNut.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#recordHeader}.
	 * @param ctx the parse tree
	 */
	void enterRecordHeader(leftNut.RecordHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#recordHeader}.
	 * @param ctx the parse tree
	 */
	void exitRecordHeader(leftNut.RecordHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponentList(leftNut.RecordComponentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponentList(leftNut.RecordComponentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#recordComponent}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponent(leftNut.RecordComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#recordComponent}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponent(leftNut.RecordComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#recordBody}.
	 * @param ctx the parse tree
	 */
	void enterRecordBody(leftNut.RecordBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#recordBody}.
	 * @param ctx the parse tree
	 */
	void exitRecordBody(leftNut.RecordBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(leftNut.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(leftNut.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(leftNut.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(leftNut.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(leftNut.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(leftNut.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(leftNut.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(leftNut.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(leftNut.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(leftNut.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(leftNut.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(leftNut.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(leftNut.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(leftNut.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(leftNut.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(leftNut.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(leftNut.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(leftNut.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(leftNut.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(leftNut.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(leftNut.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(leftNut.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(leftNut.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(leftNut.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(leftNut.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(leftNut.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(leftNut.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(leftNut.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(leftNut.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(leftNut.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(leftNut.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(leftNut.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(leftNut.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(leftNut.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(leftNut.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(leftNut.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(leftNut.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(leftNut.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(leftNut.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(leftNut.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(leftNut.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(leftNut.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(leftNut.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(leftNut.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(leftNut.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(leftNut.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(leftNut.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(leftNut.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(leftNut.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(leftNut.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(leftNut.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(leftNut.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#switchExpression}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpression(leftNut.SwitchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#switchExpression}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpression(leftNut.SwitchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabeledRule(leftNut.SwitchLabeledRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabeledRule(leftNut.SwitchLabeledRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void enterGuardedPattern(leftNut.GuardedPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void exitGuardedPattern(leftNut.GuardedPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void enterSwitchRuleOutcome(leftNut.SwitchRuleOutcomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void exitSwitchRuleOutcome(leftNut.SwitchRuleOutcomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(leftNut.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(leftNut.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(leftNut.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(leftNut.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(leftNut.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(leftNut.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(leftNut.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(leftNut.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(leftNut.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(leftNut.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(leftNut.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(leftNut.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(leftNut.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(leftNut.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(leftNut.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(leftNut.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(leftNut.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(leftNut.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(leftNut.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(leftNut.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(leftNut.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(leftNut.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(leftNut.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(leftNut.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(leftNut.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(leftNut.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(leftNut.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(leftNut.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(leftNut.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(leftNut.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(leftNut.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(leftNut.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link leftNut#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(leftNut.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link leftNut#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(leftNut.ArgumentsContext ctx);
}
