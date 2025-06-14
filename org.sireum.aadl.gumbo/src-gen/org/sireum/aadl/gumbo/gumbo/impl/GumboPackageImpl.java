/**
 * Copyright (c) 2021, Kansas State University
 * 
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.sireum.aadl.gumbo.gumbo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.aadl2.Aadl2Package;

import org.sireum.aadl.gumbo.gumbo.AndExpr;
import org.sireum.aadl.gumbo.gumbo.AnonAssumeStatement;
import org.sireum.aadl.gumbo.gumbo.AnonGuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.ArrayAccess;
import org.sireum.aadl.gumbo.gumbo.AssumeStatement;
import org.sireum.aadl.gumbo.gumbo.BinLit;
import org.sireum.aadl.gumbo.gumbo.BooleanLit;
import org.sireum.aadl.gumbo.gumbo.CallExpr;
import org.sireum.aadl.gumbo.gumbo.CaseStatementClause;
import org.sireum.aadl.gumbo.gumbo.ColonExpr;
import org.sireum.aadl.gumbo.gumbo.Compute;
import org.sireum.aadl.gumbo.gumbo.DataElement;
import org.sireum.aadl.gumbo.gumbo.DataRefExpr;
import org.sireum.aadl.gumbo.gumbo.EnumLitExpr;
import org.sireum.aadl.gumbo.gumbo.EqualNotExpr;
import org.sireum.aadl.gumbo.gumbo.F32Lit;
import org.sireum.aadl.gumbo.gumbo.F32Obj;
import org.sireum.aadl.gumbo.gumbo.F64Lit;
import org.sireum.aadl.gumbo.gumbo.F64Obj;
import org.sireum.aadl.gumbo.gumbo.FuncSpec;
import org.sireum.aadl.gumbo.gumbo.Functions;
import org.sireum.aadl.gumbo.gumbo.GExpr;
import org.sireum.aadl.gumbo.gumbo.GuaranteeStatement;
import org.sireum.aadl.gumbo.gumbo.GumboFactory;
import org.sireum.aadl.gumbo.gumbo.GumboLibrary;
import org.sireum.aadl.gumbo.gumbo.GumboPackage;
import org.sireum.aadl.gumbo.gumbo.GumboSubclause;
import org.sireum.aadl.gumbo.gumbo.HandlerClause;
import org.sireum.aadl.gumbo.gumbo.HasEventExpr;
import org.sireum.aadl.gumbo.gumbo.HexLit;
import org.sireum.aadl.gumbo.gumbo.IfElseExp;
import org.sireum.aadl.gumbo.gumbo.ImpliesExpr;
import org.sireum.aadl.gumbo.gumbo.InStateExpr;
import org.sireum.aadl.gumbo.gumbo.InfoFlowClause;
import org.sireum.aadl.gumbo.gumbo.Initialize;
import org.sireum.aadl.gumbo.gumbo.InitializeSpecStatement;
import org.sireum.aadl.gumbo.gumbo.IntegerLit;
import org.sireum.aadl.gumbo.gumbo.Integration;
import org.sireum.aadl.gumbo.gumbo.InvSpec;
import org.sireum.aadl.gumbo.gumbo.Invariants;
import org.sireum.aadl.gumbo.gumbo.LtGtExpr;
import org.sireum.aadl.gumbo.gumbo.MaySendExpr;
import org.sireum.aadl.gumbo.gumbo.MemberAccess;
import org.sireum.aadl.gumbo.gumbo.MultiplicativeExpr;
import org.sireum.aadl.gumbo.gumbo.MustSendExpr;
import org.sireum.aadl.gumbo.gumbo.NoSendExpr;
import org.sireum.aadl.gumbo.gumbo.OrExpr;
import org.sireum.aadl.gumbo.gumbo.OtherDataRef;
import org.sireum.aadl.gumbo.gumbo.OwnedExpression;
import org.sireum.aadl.gumbo.gumbo.ParenExpr;
import org.sireum.aadl.gumbo.gumbo.PlusMinusExpr;
import org.sireum.aadl.gumbo.gumbo.PostFixExpr;
import org.sireum.aadl.gumbo.gumbo.Postfix;
import org.sireum.aadl.gumbo.gumbo.QuantParam;
import org.sireum.aadl.gumbo.gumbo.QuantRange;
import org.sireum.aadl.gumbo.gumbo.QuantifiedExp;
import org.sireum.aadl.gumbo.gumbo.RecordLitExpr;
import org.sireum.aadl.gumbo.gumbo.ResultExpr;
import org.sireum.aadl.gumbo.gumbo.SlangAssertStmt;
import org.sireum.aadl.gumbo.gumbo.SlangAssumeStmt;
import org.sireum.aadl.gumbo.gumbo.SlangBlock;
import org.sireum.aadl.gumbo.gumbo.SlangBlockTerm;
import org.sireum.aadl.gumbo.gumbo.SlangCallArgs;
import org.sireum.aadl.gumbo.gumbo.SlangCallSuffix;
import org.sireum.aadl.gumbo.gumbo.SlangCase;
import org.sireum.aadl.gumbo.gumbo.SlangDefContract;
import org.sireum.aadl.gumbo.gumbo.SlangDefDef;
import org.sireum.aadl.gumbo.gumbo.SlangDefParam;
import org.sireum.aadl.gumbo.gumbo.SlangDefParams;
import org.sireum.aadl.gumbo.gumbo.SlangDoStmt;
import org.sireum.aadl.gumbo.gumbo.SlangElse;
import org.sireum.aadl.gumbo.gumbo.SlangEnsures;
import org.sireum.aadl.gumbo.gumbo.SlangForRange;
import org.sireum.aadl.gumbo.gumbo.SlangForTerm;
import org.sireum.aadl.gumbo.gumbo.SlangHaltStmt;
import org.sireum.aadl.gumbo.gumbo.SlangIfStmt;
import org.sireum.aadl.gumbo.gumbo.SlangInterp;
import org.sireum.aadl.gumbo.gumbo.SlangInterpTerm;
import org.sireum.aadl.gumbo.gumbo.SlangInvariant;
import org.sireum.aadl.gumbo.gumbo.SlangLit;
import org.sireum.aadl.gumbo.gumbo.SlangLitTerm;
import org.sireum.aadl.gumbo.gumbo.SlangLiteralInterp;
import org.sireum.aadl.gumbo.gumbo.SlangLoopContract;
import org.sireum.aadl.gumbo.gumbo.SlangMatchStmt;
import org.sireum.aadl.gumbo.gumbo.SlangModifies;
import org.sireum.aadl.gumbo.gumbo.SlangParam;
import org.sireum.aadl.gumbo.gumbo.SlangParams;
import org.sireum.aadl.gumbo.gumbo.SlangPattern;
import org.sireum.aadl.gumbo.gumbo.SlangReads;
import org.sireum.aadl.gumbo.gumbo.SlangRequires;
import org.sireum.aadl.gumbo.gumbo.SlangRet;
import org.sireum.aadl.gumbo.gumbo.SlangSpecStmt;
import org.sireum.aadl.gumbo.gumbo.SlangStmt;
import org.sireum.aadl.gumbo.gumbo.SlangStringLit;
import org.sireum.aadl.gumbo.gumbo.SlangTPattern;
import org.sireum.aadl.gumbo.gumbo.SlangType;
import org.sireum.aadl.gumbo.gumbo.SlangTypeParam;
import org.sireum.aadl.gumbo.gumbo.SlangTypeParams;
import org.sireum.aadl.gumbo.gumbo.SlangVarDef;
import org.sireum.aadl.gumbo.gumbo.SlangWhileStmt;
import org.sireum.aadl.gumbo.gumbo.SpecSection;
import org.sireum.aadl.gumbo.gumbo.SpecStatement;
import org.sireum.aadl.gumbo.gumbo.State;
import org.sireum.aadl.gumbo.gumbo.StateVarDecl;
import org.sireum.aadl.gumbo.gumbo.SubcomponentElement;
import org.sireum.aadl.gumbo.gumbo.UnaryExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GumboPackageImpl extends EPackageImpl implements GumboPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gumboLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gumboSubclauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateVarDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invariantsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integrationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initializeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initializeSpecStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass computeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infoFlowClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass handlerClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseStatementClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assumeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anonAssumeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guaranteeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anonGuaranteeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subcomponentElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass funcSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangDefDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangDefParamsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangDefParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangTypeParamsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangTypeParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangDefContractEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangInvariantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangRequiresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangReadsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangModifiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangEnsuresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangElseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangLoopContractEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangTPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangVarDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ownedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postfixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass otherDataRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangParamsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangForRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangRetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangCallSuffixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangCallArgsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangLitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangInterpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangIfStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangWhileStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangMatchStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangSpecStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangAssumeStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangAssertStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangHaltStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangDoStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifElseExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantifiedExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass impliesExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalNotExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ltGtExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colonExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusMinusExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicativeExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postFixExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangLitTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangInterpTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inStateExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maySendExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mustSendExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noSendExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasEventExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumLitExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parenExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangForTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangBlockTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass f32ObjEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass f64ObjEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordLitExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataRefExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerLitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hexLitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binLitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass f32LitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass f64LitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangStringLitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slangLiteralInterpEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.sireum.aadl.gumbo.gumbo.GumboPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GumboPackageImpl()
  {
    super(eNS_URI, GumboFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link GumboPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GumboPackage init()
  {
    if (isInited) return (GumboPackage)EPackage.Registry.INSTANCE.getEPackage(GumboPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredGumboPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    GumboPackageImpl theGumboPackage = registeredGumboPackage instanceof GumboPackageImpl ? (GumboPackageImpl)registeredGumboPackage : new GumboPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();
    Aadl2Package.eINSTANCE.eClass();

    // Create package meta-data objects
    theGumboPackage.createPackageContents();

    // Initialize created meta-data
    theGumboPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGumboPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GumboPackage.eNS_URI, theGumboPackage);
    return theGumboPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGumboLibrary()
  {
    return gumboLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGumboLibrary_Functions()
  {
    return (EReference)gumboLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGumboSubclause()
  {
    return gumboSubclauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGumboSubclause_Specs()
  {
    return (EReference)gumboSubclauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpecSection()
  {
    return specSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSpecSection_State()
  {
    return (EReference)specSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSpecSection_Functions()
  {
    return (EReference)specSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSpecSection_Invariants()
  {
    return (EReference)specSectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSpecSection_Integration()
  {
    return (EReference)specSectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSpecSection_Initialize()
  {
    return (EReference)specSectionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSpecSection_Compute()
  {
    return (EReference)specSectionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getState_Decls()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStateVarDecl()
  {
    return stateVarDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStateVarDecl_Name()
  {
    return (EAttribute)stateVarDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStateVarDecl_TypeName()
  {
    return (EReference)stateVarDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInvariants()
  {
    return invariantsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInvariants_Specs()
  {
    return (EReference)invariantsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInvSpec()
  {
    return invSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInvSpec_Id()
  {
    return (EAttribute)invSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInvSpec_Descriptor()
  {
    return (EAttribute)invSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInvSpec_Expr()
  {
    return (EReference)invSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntegration()
  {
    return integrationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIntegration_Specs()
  {
    return (EReference)integrationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInitialize()
  {
    return initializeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitialize_Modifies()
  {
    return (EReference)initializeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitialize_Specs()
  {
    return (EReference)initializeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitialize_Flows()
  {
    return (EReference)initializeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInitializeSpecStatement()
  {
    return initializeSpecStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInitializeSpecStatement_GuaranteeStatement()
  {
    return (EReference)initializeSpecStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCompute()
  {
    return computeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCompute_Modifies()
  {
    return (EReference)computeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCompute_Assumes()
  {
    return (EReference)computeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCompute_Guarantees()
  {
    return (EReference)computeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCompute_Cases()
  {
    return (EReference)computeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCompute_Handlers()
  {
    return (EReference)computeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCompute_Flows()
  {
    return (EReference)computeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInfoFlowClause()
  {
    return infoFlowClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInfoFlowClause_Id()
  {
    return (EAttribute)infoFlowClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInfoFlowClause_Descriptor()
  {
    return (EAttribute)infoFlowClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInfoFlowClause_FromPortOrStateVar()
  {
    return (EReference)infoFlowClauseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInfoFlowClause_ToPortOrStateVar()
  {
    return (EReference)infoFlowClauseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHandlerClause()
  {
    return handlerClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHandlerClause_Id()
  {
    return (EReference)handlerClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHandlerClause_Modifies()
  {
    return (EReference)handlerClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHandlerClause_Assumes()
  {
    return (EReference)handlerClauseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHandlerClause_Guarantees()
  {
    return (EReference)handlerClauseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHandlerClause_Cases()
  {
    return (EReference)handlerClauseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCaseStatementClause()
  {
    return caseStatementClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCaseStatementClause_Id()
  {
    return (EAttribute)caseStatementClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCaseStatementClause_Descriptor()
  {
    return (EAttribute)caseStatementClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCaseStatementClause_AssumeStatement()
  {
    return (EReference)caseStatementClauseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCaseStatementClause_GuaranteeStatement()
  {
    return (EReference)caseStatementClauseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSpecStatement()
  {
    return specStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpecStatement_Id()
  {
    return (EAttribute)specStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSpecStatement_Descriptor()
  {
    return (EAttribute)specStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSpecStatement_Expr()
  {
    return (EReference)specStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAssumeStatement()
  {
    return assumeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAnonAssumeStatement()
  {
    return anonAssumeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAnonAssumeStatement_Expr()
  {
    return (EReference)anonAssumeStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGuaranteeStatement()
  {
    return guaranteeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAnonGuaranteeStatement()
  {
    return anonGuaranteeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAnonGuaranteeStatement_Expr()
  {
    return (EReference)anonGuaranteeStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDataElement()
  {
    return dataElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDataElement_DataElement()
  {
    return (EReference)dataElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSubcomponentElement()
  {
    return subcomponentElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSubcomponentElement_Subcomponent()
  {
    return (EReference)subcomponentElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFunctions()
  {
    return functionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunctions_Specs()
  {
    return (EReference)functionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFuncSpec()
  {
    return funcSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangDefDef()
  {
    return slangDefDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSlangDefDef_Name()
  {
    return (EAttribute)slangDefDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangDefDef_TypeParams()
  {
    return (EReference)slangDefDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangDefDef_Params()
  {
    return (EReference)slangDefDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangDefDef_Type()
  {
    return (EReference)slangDefDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangDefDef_MethodContract()
  {
    return (EReference)slangDefDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangDefDef_Body()
  {
    return (EReference)slangDefDefEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangDefParams()
  {
    return slangDefParamsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangDefParams_Params()
  {
    return (EReference)slangDefParamsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangDefParam()
  {
    return slangDefParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSlangDefParam_Name()
  {
    return (EAttribute)slangDefParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSlangDefParam_IsMethodDef()
  {
    return (EAttribute)slangDefParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangDefParam_TypeName()
  {
    return (EReference)slangDefParamEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSlangDefParam_IsVarArg()
  {
    return (EAttribute)slangDefParamEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangTypeParams()
  {
    return slangTypeParamsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangTypeParams_TypeParam()
  {
    return (EReference)slangTypeParamsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangTypeParam()
  {
    return slangTypeParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSlangTypeParam_IsMut()
  {
    return (EAttribute)slangTypeParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSlangTypeParam_Name()
  {
    return (EAttribute)slangTypeParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangDefContract()
  {
    return slangDefContractEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangDefContract_Reads()
  {
    return (EReference)slangDefContractEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangDefContract_Requires()
  {
    return (EReference)slangDefContractEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangDefContract_Modifies()
  {
    return (EReference)slangDefContractEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangDefContract_Ensures()
  {
    return (EReference)slangDefContractEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangInvariant()
  {
    return slangInvariantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangInvariant_Exprs()
  {
    return (EReference)slangInvariantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangRequires()
  {
    return slangRequiresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangRequires_Exprs()
  {
    return (EReference)slangRequiresEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangReads()
  {
    return slangReadsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangReads_Exprs()
  {
    return (EReference)slangReadsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangModifies()
  {
    return slangModifiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangModifies_Exprs()
  {
    return (EReference)slangModifiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangEnsures()
  {
    return slangEnsuresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangEnsures_Exprs()
  {
    return (EReference)slangEnsuresEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangType()
  {
    return slangTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangType_TypeName()
  {
    return (EReference)slangTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangStmt()
  {
    return slangStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangElse()
  {
    return slangElseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangElse_Cond()
  {
    return (EReference)slangElseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangElse_B()
  {
    return (EReference)slangElseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangElse_E()
  {
    return (EReference)slangElseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangLoopContract()
  {
    return slangLoopContractEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangLoopContract_Inv()
  {
    return (EReference)slangLoopContractEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangLoopContract_Mod()
  {
    return (EReference)slangLoopContractEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangCase()
  {
    return slangCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangCase_Pattern()
  {
    return (EReference)slangCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangCase_E()
  {
    return (EReference)slangCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangCase_S()
  {
    return (EReference)slangCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangPattern()
  {
    return slangPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangPattern_Patterns()
  {
    return (EReference)slangPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangPattern_TypeName()
  {
    return (EReference)slangPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangPattern_Init()
  {
    return (EReference)slangPatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangTPattern()
  {
    return slangTPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangTPattern_Patterns()
  {
    return (EReference)slangTPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangTPattern_Type()
  {
    return (EReference)slangTPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangVarDef()
  {
    return slangVarDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangVarDef_D()
  {
    return (EReference)slangVarDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangBlock()
  {
    return slangBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangBlock_Stmts()
  {
    return (EReference)slangBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangBlock_R()
  {
    return (EReference)slangBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOwnedExpression()
  {
    return ownedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGExpr()
  {
    return gExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getQuantRange()
  {
    return quantRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getQuantRange_Lo()
  {
    return (EReference)quantRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getQuantRange_Extent()
  {
    return (EAttribute)quantRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getQuantRange_High()
  {
    return (EReference)quantRangeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getQuantParam()
  {
    return quantParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getQuantParam_Name()
  {
    return (EAttribute)quantParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getQuantParam_TypeName()
  {
    return (EReference)quantParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPostfix()
  {
    return postfixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMemberAccess()
  {
    return memberAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemberAccess_Field()
  {
    return (EAttribute)memberAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getArrayAccess()
  {
    return arrayAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getArrayAccess_Index()
  {
    return (EReference)arrayAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOtherDataRef()
  {
    return otherDataRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOtherDataRef_NamedElement()
  {
    return (EReference)otherDataRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOtherDataRef_ArrayRange()
  {
    return (EReference)otherDataRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOtherDataRef_Path()
  {
    return (EReference)otherDataRefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangParams()
  {
    return slangParamsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangParams_Params()
  {
    return (EReference)slangParamsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangParam()
  {
    return slangParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSlangParam_Name()
  {
    return (EAttribute)slangParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangParam_TypeName()
  {
    return (EReference)slangParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangForRange()
  {
    return slangForRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangForRange_E()
  {
    return (EReference)slangForRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangForRange_Upper()
  {
    return (EReference)slangForRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangForRange_Step()
  {
    return (EReference)slangForRangeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangRet()
  {
    return slangRetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangRet_E()
  {
    return (EReference)slangRetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangCallSuffix()
  {
    return slangCallSuffixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangCallSuffix_Ca()
  {
    return (EReference)slangCallSuffixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangCallArgs()
  {
    return slangCallArgsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangCallArgs_Arg()
  {
    return (EReference)slangCallArgsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangLit()
  {
    return slangLitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSlangLit_Value()
  {
    return (EAttribute)slangLitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangInterp()
  {
    return slangInterpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangIfStmt()
  {
    return slangIfStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangIfStmt_Cond()
  {
    return (EReference)slangIfStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangIfStmt_B()
  {
    return (EReference)slangIfStmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangIfStmt_E()
  {
    return (EReference)slangIfStmtEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangWhileStmt()
  {
    return slangWhileStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangWhileStmt_Cond()
  {
    return (EReference)slangWhileStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangWhileStmt_L()
  {
    return (EReference)slangWhileStmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangWhileStmt_B()
  {
    return (EReference)slangWhileStmtEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangMatchStmt()
  {
    return slangMatchStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangMatchStmt_TestExpr()
  {
    return (EReference)slangMatchStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangMatchStmt_C()
  {
    return (EReference)slangMatchStmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangSpecStmt()
  {
    return slangSpecStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangSpecStmt_B()
  {
    return (EReference)slangSpecStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangAssumeStmt()
  {
    return slangAssumeStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangAssumeStmt_E()
  {
    return (EReference)slangAssumeStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangAssertStmt()
  {
    return slangAssertStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangAssertStmt_E()
  {
    return (EReference)slangAssertStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangHaltStmt()
  {
    return slangHaltStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangDoStmt()
  {
    return slangDoStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangDoStmt_E()
  {
    return (EReference)slangDoStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIfElseExp()
  {
    return ifElseExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIfElseExp_IfCond()
  {
    return (EReference)ifElseExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIfElseExp_ThenExpr()
  {
    return (EReference)ifElseExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIfElseExp_ElseExpr()
  {
    return (EReference)ifElseExpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getQuantifiedExp()
  {
    return quantifiedExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getQuantifiedExp_Quantifier()
  {
    return (EAttribute)quantifiedExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getQuantifiedExp_QuantRange()
  {
    return (EReference)quantifiedExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getQuantifiedExp_QuantParam()
  {
    return (EReference)quantifiedExpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getQuantifiedExp_QuantifiedExpr()
  {
    return (EReference)quantifiedExpEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getImpliesExpr()
  {
    return impliesExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getImpliesExpr_Left()
  {
    return (EReference)impliesExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getImpliesExpr_Op()
  {
    return (EAttribute)impliesExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getImpliesExpr_Right()
  {
    return (EReference)impliesExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOrExpr()
  {
    return orExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrExpr_Left()
  {
    return (EReference)orExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOrExpr_Op()
  {
    return (EAttribute)orExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrExpr_Right()
  {
    return (EReference)orExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAndExpr()
  {
    return andExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAndExpr_Left()
  {
    return (EReference)andExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAndExpr_Op()
  {
    return (EAttribute)andExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAndExpr_Right()
  {
    return (EReference)andExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEqualNotExpr()
  {
    return equalNotExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEqualNotExpr_Left()
  {
    return (EReference)equalNotExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEqualNotExpr_Op()
  {
    return (EAttribute)equalNotExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEqualNotExpr_Right()
  {
    return (EReference)equalNotExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLtGtExpr()
  {
    return ltGtExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLtGtExpr_Left()
  {
    return (EReference)ltGtExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLtGtExpr_Op()
  {
    return (EAttribute)ltGtExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLtGtExpr_Right()
  {
    return (EReference)ltGtExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getColonExpr()
  {
    return colonExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getColonExpr_Left()
  {
    return (EReference)colonExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getColonExpr_Op()
  {
    return (EAttribute)colonExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getColonExpr_Right()
  {
    return (EReference)colonExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPlusMinusExpr()
  {
    return plusMinusExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlusMinusExpr_Left()
  {
    return (EReference)plusMinusExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlusMinusExpr_Op()
  {
    return (EAttribute)plusMinusExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlusMinusExpr_Right()
  {
    return (EReference)plusMinusExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMultiplicativeExpr()
  {
    return multiplicativeExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMultiplicativeExpr_Left()
  {
    return (EReference)multiplicativeExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMultiplicativeExpr_Op()
  {
    return (EAttribute)multiplicativeExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMultiplicativeExpr_Right()
  {
    return (EReference)multiplicativeExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUnaryExpr()
  {
    return unaryExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUnaryExpr_Op()
  {
    return (EAttribute)unaryExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUnaryExpr_Exp()
  {
    return (EReference)unaryExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPostFixExpr()
  {
    return postFixExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPostFixExpr_BaseExp()
  {
    return (EReference)postFixExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPostFixExpr_Posts()
  {
    return (EReference)postFixExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangLitTerm()
  {
    return slangLitTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangLitTerm_Lit()
  {
    return (EReference)slangLitTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangInterpTerm()
  {
    return slangInterpTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangInterpTerm_I()
  {
    return (EReference)slangInterpTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInStateExpr()
  {
    return inStateExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInStateExpr_StateVar()
  {
    return (EReference)inStateExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMaySendExpr()
  {
    return maySendExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMaySendExpr_EventPort()
  {
    return (EReference)maySendExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMaySendExpr_Value()
  {
    return (EReference)maySendExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMustSendExpr()
  {
    return mustSendExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMustSendExpr_EventPort()
  {
    return (EReference)mustSendExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMustSendExpr_Value()
  {
    return (EReference)mustSendExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNoSendExpr()
  {
    return noSendExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNoSendExpr_EventPort()
  {
    return (EReference)noSendExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHasEventExpr()
  {
    return hasEventExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHasEventExpr_EventPort()
  {
    return (EReference)hasEventExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEnumLitExpr()
  {
    return enumLitExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEnumLitExpr_EnumType()
  {
    return (EReference)enumLitExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEnumLitExpr_Value()
  {
    return (EReference)enumLitExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParenExpr()
  {
    return parenExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getParenExpr_Exp()
  {
    return (EReference)parenExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangForTerm()
  {
    return slangForTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangForTerm_R()
  {
    return (EReference)slangForTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangForTerm_B()
  {
    return (EReference)slangForTermEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangForTerm_E()
  {
    return (EReference)slangForTermEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangBlockTerm()
  {
    return slangBlockTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangBlockTerm_P()
  {
    return (EReference)slangBlockTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangBlockTerm_E()
  {
    return (EReference)slangBlockTermEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangBlockTerm_Stmt()
  {
    return (EReference)slangBlockTermEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSlangBlockTerm_R()
  {
    return (EReference)slangBlockTermEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getF32Obj()
  {
    return f32ObjEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getF32Obj_Attr()
  {
    return (EAttribute)f32ObjEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getF64Obj()
  {
    return f64ObjEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getF64Obj_Attr()
  {
    return (EAttribute)f64ObjEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCallExpr()
  {
    return callExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCallExpr_Id()
  {
    return (EReference)callExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCallExpr_CallSuffix()
  {
    return (EReference)callExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRecordLitExpr()
  {
    return recordLitExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRecordLitExpr_RecordType()
  {
    return (EReference)recordLitExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRecordLitExpr_Args()
  {
    return (EReference)recordLitExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRecordLitExpr_ArgExpr()
  {
    return (EReference)recordLitExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDataRefExpr()
  {
    return dataRefExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDataRefExpr_PortOrSubcomponentOrStateVar()
  {
    return (EReference)dataRefExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getResultExpr()
  {
    return resultExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBooleanLit()
  {
    return booleanLitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntegerLit()
  {
    return integerLitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHexLit()
  {
    return hexLitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBinLit()
  {
    return binLitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getF32Lit()
  {
    return f32LitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getF64Lit()
  {
    return f64LitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangStringLit()
  {
    return slangStringLitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSlangLiteralInterp()
  {
    return slangLiteralInterpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSlangLiteralInterp_Sli()
  {
    return (EAttribute)slangLiteralInterpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GumboFactory getGumboFactory()
  {
    return (GumboFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    gumboLibraryEClass = createEClass(GUMBO_LIBRARY);
    createEReference(gumboLibraryEClass, GUMBO_LIBRARY__FUNCTIONS);

    gumboSubclauseEClass = createEClass(GUMBO_SUBCLAUSE);
    createEReference(gumboSubclauseEClass, GUMBO_SUBCLAUSE__SPECS);

    specSectionEClass = createEClass(SPEC_SECTION);
    createEReference(specSectionEClass, SPEC_SECTION__STATE);
    createEReference(specSectionEClass, SPEC_SECTION__FUNCTIONS);
    createEReference(specSectionEClass, SPEC_SECTION__INVARIANTS);
    createEReference(specSectionEClass, SPEC_SECTION__INTEGRATION);
    createEReference(specSectionEClass, SPEC_SECTION__INITIALIZE);
    createEReference(specSectionEClass, SPEC_SECTION__COMPUTE);

    stateEClass = createEClass(STATE);
    createEReference(stateEClass, STATE__DECLS);

    stateVarDeclEClass = createEClass(STATE_VAR_DECL);
    createEAttribute(stateVarDeclEClass, STATE_VAR_DECL__NAME);
    createEReference(stateVarDeclEClass, STATE_VAR_DECL__TYPE_NAME);

    invariantsEClass = createEClass(INVARIANTS);
    createEReference(invariantsEClass, INVARIANTS__SPECS);

    invSpecEClass = createEClass(INV_SPEC);
    createEAttribute(invSpecEClass, INV_SPEC__ID);
    createEAttribute(invSpecEClass, INV_SPEC__DESCRIPTOR);
    createEReference(invSpecEClass, INV_SPEC__EXPR);

    integrationEClass = createEClass(INTEGRATION);
    createEReference(integrationEClass, INTEGRATION__SPECS);

    initializeEClass = createEClass(INITIALIZE);
    createEReference(initializeEClass, INITIALIZE__MODIFIES);
    createEReference(initializeEClass, INITIALIZE__SPECS);
    createEReference(initializeEClass, INITIALIZE__FLOWS);

    initializeSpecStatementEClass = createEClass(INITIALIZE_SPEC_STATEMENT);
    createEReference(initializeSpecStatementEClass, INITIALIZE_SPEC_STATEMENT__GUARANTEE_STATEMENT);

    computeEClass = createEClass(COMPUTE);
    createEReference(computeEClass, COMPUTE__MODIFIES);
    createEReference(computeEClass, COMPUTE__ASSUMES);
    createEReference(computeEClass, COMPUTE__GUARANTEES);
    createEReference(computeEClass, COMPUTE__CASES);
    createEReference(computeEClass, COMPUTE__HANDLERS);
    createEReference(computeEClass, COMPUTE__FLOWS);

    infoFlowClauseEClass = createEClass(INFO_FLOW_CLAUSE);
    createEAttribute(infoFlowClauseEClass, INFO_FLOW_CLAUSE__ID);
    createEAttribute(infoFlowClauseEClass, INFO_FLOW_CLAUSE__DESCRIPTOR);
    createEReference(infoFlowClauseEClass, INFO_FLOW_CLAUSE__FROM_PORT_OR_STATE_VAR);
    createEReference(infoFlowClauseEClass, INFO_FLOW_CLAUSE__TO_PORT_OR_STATE_VAR);

    handlerClauseEClass = createEClass(HANDLER_CLAUSE);
    createEReference(handlerClauseEClass, HANDLER_CLAUSE__ID);
    createEReference(handlerClauseEClass, HANDLER_CLAUSE__MODIFIES);
    createEReference(handlerClauseEClass, HANDLER_CLAUSE__ASSUMES);
    createEReference(handlerClauseEClass, HANDLER_CLAUSE__GUARANTEES);
    createEReference(handlerClauseEClass, HANDLER_CLAUSE__CASES);

    caseStatementClauseEClass = createEClass(CASE_STATEMENT_CLAUSE);
    createEAttribute(caseStatementClauseEClass, CASE_STATEMENT_CLAUSE__ID);
    createEAttribute(caseStatementClauseEClass, CASE_STATEMENT_CLAUSE__DESCRIPTOR);
    createEReference(caseStatementClauseEClass, CASE_STATEMENT_CLAUSE__ASSUME_STATEMENT);
    createEReference(caseStatementClauseEClass, CASE_STATEMENT_CLAUSE__GUARANTEE_STATEMENT);

    specStatementEClass = createEClass(SPEC_STATEMENT);
    createEAttribute(specStatementEClass, SPEC_STATEMENT__ID);
    createEAttribute(specStatementEClass, SPEC_STATEMENT__DESCRIPTOR);
    createEReference(specStatementEClass, SPEC_STATEMENT__EXPR);

    assumeStatementEClass = createEClass(ASSUME_STATEMENT);

    anonAssumeStatementEClass = createEClass(ANON_ASSUME_STATEMENT);
    createEReference(anonAssumeStatementEClass, ANON_ASSUME_STATEMENT__EXPR);

    guaranteeStatementEClass = createEClass(GUARANTEE_STATEMENT);

    anonGuaranteeStatementEClass = createEClass(ANON_GUARANTEE_STATEMENT);
    createEReference(anonGuaranteeStatementEClass, ANON_GUARANTEE_STATEMENT__EXPR);

    dataElementEClass = createEClass(DATA_ELEMENT);
    createEReference(dataElementEClass, DATA_ELEMENT__DATA_ELEMENT);

    subcomponentElementEClass = createEClass(SUBCOMPONENT_ELEMENT);
    createEReference(subcomponentElementEClass, SUBCOMPONENT_ELEMENT__SUBCOMPONENT);

    functionsEClass = createEClass(FUNCTIONS);
    createEReference(functionsEClass, FUNCTIONS__SPECS);

    funcSpecEClass = createEClass(FUNC_SPEC);

    slangDefDefEClass = createEClass(SLANG_DEF_DEF);
    createEAttribute(slangDefDefEClass, SLANG_DEF_DEF__NAME);
    createEReference(slangDefDefEClass, SLANG_DEF_DEF__TYPE_PARAMS);
    createEReference(slangDefDefEClass, SLANG_DEF_DEF__PARAMS);
    createEReference(slangDefDefEClass, SLANG_DEF_DEF__TYPE);
    createEReference(slangDefDefEClass, SLANG_DEF_DEF__METHOD_CONTRACT);
    createEReference(slangDefDefEClass, SLANG_DEF_DEF__BODY);

    slangDefParamsEClass = createEClass(SLANG_DEF_PARAMS);
    createEReference(slangDefParamsEClass, SLANG_DEF_PARAMS__PARAMS);

    slangDefParamEClass = createEClass(SLANG_DEF_PARAM);
    createEAttribute(slangDefParamEClass, SLANG_DEF_PARAM__NAME);
    createEAttribute(slangDefParamEClass, SLANG_DEF_PARAM__IS_METHOD_DEF);
    createEReference(slangDefParamEClass, SLANG_DEF_PARAM__TYPE_NAME);
    createEAttribute(slangDefParamEClass, SLANG_DEF_PARAM__IS_VAR_ARG);

    slangTypeParamsEClass = createEClass(SLANG_TYPE_PARAMS);
    createEReference(slangTypeParamsEClass, SLANG_TYPE_PARAMS__TYPE_PARAM);

    slangTypeParamEClass = createEClass(SLANG_TYPE_PARAM);
    createEAttribute(slangTypeParamEClass, SLANG_TYPE_PARAM__IS_MUT);
    createEAttribute(slangTypeParamEClass, SLANG_TYPE_PARAM__NAME);

    slangDefContractEClass = createEClass(SLANG_DEF_CONTRACT);
    createEReference(slangDefContractEClass, SLANG_DEF_CONTRACT__READS);
    createEReference(slangDefContractEClass, SLANG_DEF_CONTRACT__REQUIRES);
    createEReference(slangDefContractEClass, SLANG_DEF_CONTRACT__MODIFIES);
    createEReference(slangDefContractEClass, SLANG_DEF_CONTRACT__ENSURES);

    slangInvariantEClass = createEClass(SLANG_INVARIANT);
    createEReference(slangInvariantEClass, SLANG_INVARIANT__EXPRS);

    slangRequiresEClass = createEClass(SLANG_REQUIRES);
    createEReference(slangRequiresEClass, SLANG_REQUIRES__EXPRS);

    slangReadsEClass = createEClass(SLANG_READS);
    createEReference(slangReadsEClass, SLANG_READS__EXPRS);

    slangModifiesEClass = createEClass(SLANG_MODIFIES);
    createEReference(slangModifiesEClass, SLANG_MODIFIES__EXPRS);

    slangEnsuresEClass = createEClass(SLANG_ENSURES);
    createEReference(slangEnsuresEClass, SLANG_ENSURES__EXPRS);

    slangTypeEClass = createEClass(SLANG_TYPE);
    createEReference(slangTypeEClass, SLANG_TYPE__TYPE_NAME);

    slangStmtEClass = createEClass(SLANG_STMT);

    slangElseEClass = createEClass(SLANG_ELSE);
    createEReference(slangElseEClass, SLANG_ELSE__COND);
    createEReference(slangElseEClass, SLANG_ELSE__B);
    createEReference(slangElseEClass, SLANG_ELSE__E);

    slangLoopContractEClass = createEClass(SLANG_LOOP_CONTRACT);
    createEReference(slangLoopContractEClass, SLANG_LOOP_CONTRACT__INV);
    createEReference(slangLoopContractEClass, SLANG_LOOP_CONTRACT__MOD);

    slangCaseEClass = createEClass(SLANG_CASE);
    createEReference(slangCaseEClass, SLANG_CASE__PATTERN);
    createEReference(slangCaseEClass, SLANG_CASE__E);
    createEReference(slangCaseEClass, SLANG_CASE__S);

    slangPatternEClass = createEClass(SLANG_PATTERN);
    createEReference(slangPatternEClass, SLANG_PATTERN__PATTERNS);
    createEReference(slangPatternEClass, SLANG_PATTERN__TYPE_NAME);
    createEReference(slangPatternEClass, SLANG_PATTERN__INIT);

    slangTPatternEClass = createEClass(SLANG_TPATTERN);
    createEReference(slangTPatternEClass, SLANG_TPATTERN__PATTERNS);
    createEReference(slangTPatternEClass, SLANG_TPATTERN__TYPE);

    slangVarDefEClass = createEClass(SLANG_VAR_DEF);
    createEReference(slangVarDefEClass, SLANG_VAR_DEF__D);

    slangBlockEClass = createEClass(SLANG_BLOCK);
    createEReference(slangBlockEClass, SLANG_BLOCK__STMTS);
    createEReference(slangBlockEClass, SLANG_BLOCK__R);

    ownedExpressionEClass = createEClass(OWNED_EXPRESSION);

    gExprEClass = createEClass(GEXPR);

    quantRangeEClass = createEClass(QUANT_RANGE);
    createEReference(quantRangeEClass, QUANT_RANGE__LO);
    createEAttribute(quantRangeEClass, QUANT_RANGE__EXTENT);
    createEReference(quantRangeEClass, QUANT_RANGE__HIGH);

    quantParamEClass = createEClass(QUANT_PARAM);
    createEAttribute(quantParamEClass, QUANT_PARAM__NAME);
    createEReference(quantParamEClass, QUANT_PARAM__TYPE_NAME);

    postfixEClass = createEClass(POSTFIX);

    memberAccessEClass = createEClass(MEMBER_ACCESS);
    createEAttribute(memberAccessEClass, MEMBER_ACCESS__FIELD);

    arrayAccessEClass = createEClass(ARRAY_ACCESS);
    createEReference(arrayAccessEClass, ARRAY_ACCESS__INDEX);

    otherDataRefEClass = createEClass(OTHER_DATA_REF);
    createEReference(otherDataRefEClass, OTHER_DATA_REF__NAMED_ELEMENT);
    createEReference(otherDataRefEClass, OTHER_DATA_REF__ARRAY_RANGE);
    createEReference(otherDataRefEClass, OTHER_DATA_REF__PATH);

    slangParamsEClass = createEClass(SLANG_PARAMS);
    createEReference(slangParamsEClass, SLANG_PARAMS__PARAMS);

    slangParamEClass = createEClass(SLANG_PARAM);
    createEAttribute(slangParamEClass, SLANG_PARAM__NAME);
    createEReference(slangParamEClass, SLANG_PARAM__TYPE_NAME);

    slangForRangeEClass = createEClass(SLANG_FOR_RANGE);
    createEReference(slangForRangeEClass, SLANG_FOR_RANGE__E);
    createEReference(slangForRangeEClass, SLANG_FOR_RANGE__UPPER);
    createEReference(slangForRangeEClass, SLANG_FOR_RANGE__STEP);

    slangRetEClass = createEClass(SLANG_RET);
    createEReference(slangRetEClass, SLANG_RET__E);

    slangCallSuffixEClass = createEClass(SLANG_CALL_SUFFIX);
    createEReference(slangCallSuffixEClass, SLANG_CALL_SUFFIX__CA);

    slangCallArgsEClass = createEClass(SLANG_CALL_ARGS);
    createEReference(slangCallArgsEClass, SLANG_CALL_ARGS__ARG);

    slangLitEClass = createEClass(SLANG_LIT);
    createEAttribute(slangLitEClass, SLANG_LIT__VALUE);

    slangInterpEClass = createEClass(SLANG_INTERP);

    slangIfStmtEClass = createEClass(SLANG_IF_STMT);
    createEReference(slangIfStmtEClass, SLANG_IF_STMT__COND);
    createEReference(slangIfStmtEClass, SLANG_IF_STMT__B);
    createEReference(slangIfStmtEClass, SLANG_IF_STMT__E);

    slangWhileStmtEClass = createEClass(SLANG_WHILE_STMT);
    createEReference(slangWhileStmtEClass, SLANG_WHILE_STMT__COND);
    createEReference(slangWhileStmtEClass, SLANG_WHILE_STMT__L);
    createEReference(slangWhileStmtEClass, SLANG_WHILE_STMT__B);

    slangMatchStmtEClass = createEClass(SLANG_MATCH_STMT);
    createEReference(slangMatchStmtEClass, SLANG_MATCH_STMT__TEST_EXPR);
    createEReference(slangMatchStmtEClass, SLANG_MATCH_STMT__C);

    slangSpecStmtEClass = createEClass(SLANG_SPEC_STMT);
    createEReference(slangSpecStmtEClass, SLANG_SPEC_STMT__B);

    slangAssumeStmtEClass = createEClass(SLANG_ASSUME_STMT);
    createEReference(slangAssumeStmtEClass, SLANG_ASSUME_STMT__E);

    slangAssertStmtEClass = createEClass(SLANG_ASSERT_STMT);
    createEReference(slangAssertStmtEClass, SLANG_ASSERT_STMT__E);

    slangHaltStmtEClass = createEClass(SLANG_HALT_STMT);

    slangDoStmtEClass = createEClass(SLANG_DO_STMT);
    createEReference(slangDoStmtEClass, SLANG_DO_STMT__E);

    ifElseExpEClass = createEClass(IF_ELSE_EXP);
    createEReference(ifElseExpEClass, IF_ELSE_EXP__IF_COND);
    createEReference(ifElseExpEClass, IF_ELSE_EXP__THEN_EXPR);
    createEReference(ifElseExpEClass, IF_ELSE_EXP__ELSE_EXPR);

    quantifiedExpEClass = createEClass(QUANTIFIED_EXP);
    createEAttribute(quantifiedExpEClass, QUANTIFIED_EXP__QUANTIFIER);
    createEReference(quantifiedExpEClass, QUANTIFIED_EXP__QUANT_RANGE);
    createEReference(quantifiedExpEClass, QUANTIFIED_EXP__QUANT_PARAM);
    createEReference(quantifiedExpEClass, QUANTIFIED_EXP__QUANTIFIED_EXPR);

    impliesExprEClass = createEClass(IMPLIES_EXPR);
    createEReference(impliesExprEClass, IMPLIES_EXPR__LEFT);
    createEAttribute(impliesExprEClass, IMPLIES_EXPR__OP);
    createEReference(impliesExprEClass, IMPLIES_EXPR__RIGHT);

    orExprEClass = createEClass(OR_EXPR);
    createEReference(orExprEClass, OR_EXPR__LEFT);
    createEAttribute(orExprEClass, OR_EXPR__OP);
    createEReference(orExprEClass, OR_EXPR__RIGHT);

    andExprEClass = createEClass(AND_EXPR);
    createEReference(andExprEClass, AND_EXPR__LEFT);
    createEAttribute(andExprEClass, AND_EXPR__OP);
    createEReference(andExprEClass, AND_EXPR__RIGHT);

    equalNotExprEClass = createEClass(EQUAL_NOT_EXPR);
    createEReference(equalNotExprEClass, EQUAL_NOT_EXPR__LEFT);
    createEAttribute(equalNotExprEClass, EQUAL_NOT_EXPR__OP);
    createEReference(equalNotExprEClass, EQUAL_NOT_EXPR__RIGHT);

    ltGtExprEClass = createEClass(LT_GT_EXPR);
    createEReference(ltGtExprEClass, LT_GT_EXPR__LEFT);
    createEAttribute(ltGtExprEClass, LT_GT_EXPR__OP);
    createEReference(ltGtExprEClass, LT_GT_EXPR__RIGHT);

    colonExprEClass = createEClass(COLON_EXPR);
    createEReference(colonExprEClass, COLON_EXPR__LEFT);
    createEAttribute(colonExprEClass, COLON_EXPR__OP);
    createEReference(colonExprEClass, COLON_EXPR__RIGHT);

    plusMinusExprEClass = createEClass(PLUS_MINUS_EXPR);
    createEReference(plusMinusExprEClass, PLUS_MINUS_EXPR__LEFT);
    createEAttribute(plusMinusExprEClass, PLUS_MINUS_EXPR__OP);
    createEReference(plusMinusExprEClass, PLUS_MINUS_EXPR__RIGHT);

    multiplicativeExprEClass = createEClass(MULTIPLICATIVE_EXPR);
    createEReference(multiplicativeExprEClass, MULTIPLICATIVE_EXPR__LEFT);
    createEAttribute(multiplicativeExprEClass, MULTIPLICATIVE_EXPR__OP);
    createEReference(multiplicativeExprEClass, MULTIPLICATIVE_EXPR__RIGHT);

    unaryExprEClass = createEClass(UNARY_EXPR);
    createEAttribute(unaryExprEClass, UNARY_EXPR__OP);
    createEReference(unaryExprEClass, UNARY_EXPR__EXP);

    postFixExprEClass = createEClass(POST_FIX_EXPR);
    createEReference(postFixExprEClass, POST_FIX_EXPR__BASE_EXP);
    createEReference(postFixExprEClass, POST_FIX_EXPR__POSTS);

    slangLitTermEClass = createEClass(SLANG_LIT_TERM);
    createEReference(slangLitTermEClass, SLANG_LIT_TERM__LIT);

    slangInterpTermEClass = createEClass(SLANG_INTERP_TERM);
    createEReference(slangInterpTermEClass, SLANG_INTERP_TERM__I);

    inStateExprEClass = createEClass(IN_STATE_EXPR);
    createEReference(inStateExprEClass, IN_STATE_EXPR__STATE_VAR);

    maySendExprEClass = createEClass(MAY_SEND_EXPR);
    createEReference(maySendExprEClass, MAY_SEND_EXPR__EVENT_PORT);
    createEReference(maySendExprEClass, MAY_SEND_EXPR__VALUE);

    mustSendExprEClass = createEClass(MUST_SEND_EXPR);
    createEReference(mustSendExprEClass, MUST_SEND_EXPR__EVENT_PORT);
    createEReference(mustSendExprEClass, MUST_SEND_EXPR__VALUE);

    noSendExprEClass = createEClass(NO_SEND_EXPR);
    createEReference(noSendExprEClass, NO_SEND_EXPR__EVENT_PORT);

    hasEventExprEClass = createEClass(HAS_EVENT_EXPR);
    createEReference(hasEventExprEClass, HAS_EVENT_EXPR__EVENT_PORT);

    enumLitExprEClass = createEClass(ENUM_LIT_EXPR);
    createEReference(enumLitExprEClass, ENUM_LIT_EXPR__ENUM_TYPE);
    createEReference(enumLitExprEClass, ENUM_LIT_EXPR__VALUE);

    parenExprEClass = createEClass(PAREN_EXPR);
    createEReference(parenExprEClass, PAREN_EXPR__EXP);

    slangForTermEClass = createEClass(SLANG_FOR_TERM);
    createEReference(slangForTermEClass, SLANG_FOR_TERM__R);
    createEReference(slangForTermEClass, SLANG_FOR_TERM__B);
    createEReference(slangForTermEClass, SLANG_FOR_TERM__E);

    slangBlockTermEClass = createEClass(SLANG_BLOCK_TERM);
    createEReference(slangBlockTermEClass, SLANG_BLOCK_TERM__P);
    createEReference(slangBlockTermEClass, SLANG_BLOCK_TERM__E);
    createEReference(slangBlockTermEClass, SLANG_BLOCK_TERM__STMT);
    createEReference(slangBlockTermEClass, SLANG_BLOCK_TERM__R);

    f32ObjEClass = createEClass(F32_OBJ);
    createEAttribute(f32ObjEClass, F32_OBJ__ATTR);

    f64ObjEClass = createEClass(F64_OBJ);
    createEAttribute(f64ObjEClass, F64_OBJ__ATTR);

    callExprEClass = createEClass(CALL_EXPR);
    createEReference(callExprEClass, CALL_EXPR__ID);
    createEReference(callExprEClass, CALL_EXPR__CALL_SUFFIX);

    recordLitExprEClass = createEClass(RECORD_LIT_EXPR);
    createEReference(recordLitExprEClass, RECORD_LIT_EXPR__RECORD_TYPE);
    createEReference(recordLitExprEClass, RECORD_LIT_EXPR__ARGS);
    createEReference(recordLitExprEClass, RECORD_LIT_EXPR__ARG_EXPR);

    dataRefExprEClass = createEClass(DATA_REF_EXPR);
    createEReference(dataRefExprEClass, DATA_REF_EXPR__PORT_OR_SUBCOMPONENT_OR_STATE_VAR);

    resultExprEClass = createEClass(RESULT_EXPR);

    booleanLitEClass = createEClass(BOOLEAN_LIT);

    integerLitEClass = createEClass(INTEGER_LIT);

    hexLitEClass = createEClass(HEX_LIT);

    binLitEClass = createEClass(BIN_LIT);

    f32LitEClass = createEClass(F32_LIT);

    f64LitEClass = createEClass(F64_LIT);

    slangStringLitEClass = createEClass(SLANG_STRING_LIT);

    slangLiteralInterpEClass = createEClass(SLANG_LITERAL_INTERP);
    createEAttribute(slangLiteralInterpEClass, SLANG_LITERAL_INTERP__SLI);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    Aadl2Package theAadl2Package = (Aadl2Package)EPackage.Registry.INSTANCE.getEPackage(Aadl2Package.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    gumboLibraryEClass.getESuperTypes().add(theAadl2Package.getAnnexLibrary());
    gumboSubclauseEClass.getESuperTypes().add(theAadl2Package.getAnnexSubclause());
    assumeStatementEClass.getESuperTypes().add(this.getSpecStatement());
    guaranteeStatementEClass.getESuperTypes().add(this.getSpecStatement());
    slangDefDefEClass.getESuperTypes().add(this.getFuncSpec());
    slangPatternEClass.getESuperTypes().add(this.getSlangVarDef());
    slangVarDefEClass.getESuperTypes().add(this.getSlangStmt());
    slangBlockEClass.getESuperTypes().add(this.getSlangElse());
    gExprEClass.getESuperTypes().add(this.getOwnedExpression());
    memberAccessEClass.getESuperTypes().add(this.getPostfix());
    arrayAccessEClass.getESuperTypes().add(this.getPostfix());
    slangIfStmtEClass.getESuperTypes().add(this.getSlangStmt());
    slangWhileStmtEClass.getESuperTypes().add(this.getSlangStmt());
    slangMatchStmtEClass.getESuperTypes().add(this.getSlangStmt());
    slangSpecStmtEClass.getESuperTypes().add(this.getSlangStmt());
    slangAssumeStmtEClass.getESuperTypes().add(this.getSlangStmt());
    slangAssertStmtEClass.getESuperTypes().add(this.getSlangStmt());
    slangHaltStmtEClass.getESuperTypes().add(this.getSlangStmt());
    slangDoStmtEClass.getESuperTypes().add(this.getSlangStmt());
    ifElseExpEClass.getESuperTypes().add(this.getGExpr());
    quantifiedExpEClass.getESuperTypes().add(this.getGExpr());
    impliesExprEClass.getESuperTypes().add(this.getGExpr());
    orExprEClass.getESuperTypes().add(this.getGExpr());
    andExprEClass.getESuperTypes().add(this.getGExpr());
    equalNotExprEClass.getESuperTypes().add(this.getGExpr());
    ltGtExprEClass.getESuperTypes().add(this.getGExpr());
    colonExprEClass.getESuperTypes().add(this.getGExpr());
    plusMinusExprEClass.getESuperTypes().add(this.getGExpr());
    multiplicativeExprEClass.getESuperTypes().add(this.getGExpr());
    unaryExprEClass.getESuperTypes().add(this.getGExpr());
    postFixExprEClass.getESuperTypes().add(this.getGExpr());
    slangLitTermEClass.getESuperTypes().add(this.getGExpr());
    slangInterpTermEClass.getESuperTypes().add(this.getGExpr());
    inStateExprEClass.getESuperTypes().add(this.getGExpr());
    maySendExprEClass.getESuperTypes().add(this.getGExpr());
    mustSendExprEClass.getESuperTypes().add(this.getGExpr());
    noSendExprEClass.getESuperTypes().add(this.getGExpr());
    hasEventExprEClass.getESuperTypes().add(this.getGExpr());
    enumLitExprEClass.getESuperTypes().add(this.getGExpr());
    parenExprEClass.getESuperTypes().add(this.getGExpr());
    slangForTermEClass.getESuperTypes().add(this.getGExpr());
    slangBlockTermEClass.getESuperTypes().add(this.getGExpr());
    f32ObjEClass.getESuperTypes().add(this.getGExpr());
    f64ObjEClass.getESuperTypes().add(this.getGExpr());
    callExprEClass.getESuperTypes().add(this.getGExpr());
    recordLitExprEClass.getESuperTypes().add(this.getGExpr());
    dataRefExprEClass.getESuperTypes().add(this.getGExpr());
    resultExprEClass.getESuperTypes().add(this.getGExpr());
    booleanLitEClass.getESuperTypes().add(this.getSlangLit());
    integerLitEClass.getESuperTypes().add(this.getSlangLit());
    hexLitEClass.getESuperTypes().add(this.getSlangLit());
    binLitEClass.getESuperTypes().add(this.getSlangLit());
    f32LitEClass.getESuperTypes().add(this.getSlangLit());
    f64LitEClass.getESuperTypes().add(this.getSlangLit());
    slangStringLitEClass.getESuperTypes().add(this.getSlangLit());
    slangLiteralInterpEClass.getESuperTypes().add(this.getSlangInterp());

    // Initialize classes and features; add operations and parameters
    initEClass(gumboLibraryEClass, GumboLibrary.class, "GumboLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGumboLibrary_Functions(), this.getFunctions(), null, "functions", null, 0, 1, GumboLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gumboSubclauseEClass, GumboSubclause.class, "GumboSubclause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGumboSubclause_Specs(), this.getSpecSection(), null, "specs", null, 0, 1, GumboSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specSectionEClass, SpecSection.class, "SpecSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpecSection_State(), this.getState(), null, "state", null, 0, 1, SpecSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecSection_Functions(), this.getFunctions(), null, "functions", null, 0, 1, SpecSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecSection_Invariants(), this.getInvariants(), null, "invariants", null, 0, 1, SpecSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecSection_Integration(), this.getIntegration(), null, "integration", null, 0, 1, SpecSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecSection_Initialize(), this.getInitialize(), null, "initialize", null, 0, 1, SpecSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecSection_Compute(), this.getCompute(), null, "compute", null, 0, 1, SpecSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getState_Decls(), this.getStateVarDecl(), null, "decls", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateVarDeclEClass, StateVarDecl.class, "StateVarDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateVarDecl_Name(), theEcorePackage.getEString(), "name", null, 0, 1, StateVarDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateVarDecl_TypeName(), theAadl2Package.getDataSubcomponentType(), null, "typeName", null, 0, 1, StateVarDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invariantsEClass, Invariants.class, "Invariants", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInvariants_Specs(), this.getInvSpec(), null, "specs", null, 0, -1, Invariants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invSpecEClass, InvSpec.class, "InvSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInvSpec_Id(), theEcorePackage.getEString(), "id", null, 0, 1, InvSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInvSpec_Descriptor(), theEcorePackage.getEString(), "descriptor", null, 0, 1, InvSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvSpec_Expr(), this.getOwnedExpression(), null, "expr", null, 0, 1, InvSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integrationEClass, Integration.class, "Integration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegration_Specs(), this.getSpecStatement(), null, "specs", null, 0, -1, Integration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initializeEClass, Initialize.class, "Initialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInitialize_Modifies(), this.getSlangModifies(), null, "modifies", null, 0, 1, Initialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitialize_Specs(), this.getInitializeSpecStatement(), null, "specs", null, 0, -1, Initialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitialize_Flows(), this.getInfoFlowClause(), null, "flows", null, 0, -1, Initialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initializeSpecStatementEClass, InitializeSpecStatement.class, "InitializeSpecStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInitializeSpecStatement_GuaranteeStatement(), this.getGuaranteeStatement(), null, "guaranteeStatement", null, 0, 1, InitializeSpecStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(computeEClass, Compute.class, "Compute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompute_Modifies(), this.getSlangModifies(), null, "modifies", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompute_Assumes(), this.getAssumeStatement(), null, "assumes", null, 0, -1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompute_Guarantees(), this.getGuaranteeStatement(), null, "guarantees", null, 0, -1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompute_Cases(), this.getCaseStatementClause(), null, "cases", null, 0, -1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompute_Handlers(), this.getHandlerClause(), null, "handlers", null, 0, -1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompute_Flows(), this.getInfoFlowClause(), null, "flows", null, 0, -1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(infoFlowClauseEClass, InfoFlowClause.class, "InfoFlowClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInfoFlowClause_Id(), theEcorePackage.getEString(), "id", null, 0, 1, InfoFlowClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInfoFlowClause_Descriptor(), theEcorePackage.getEString(), "descriptor", null, 0, 1, InfoFlowClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfoFlowClause_FromPortOrStateVar(), theEcorePackage.getEObject(), null, "fromPortOrStateVar", null, 0, -1, InfoFlowClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfoFlowClause_ToPortOrStateVar(), theEcorePackage.getEObject(), null, "toPortOrStateVar", null, 0, -1, InfoFlowClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(handlerClauseEClass, HandlerClause.class, "HandlerClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHandlerClause_Id(), theAadl2Package.getPort(), null, "id", null, 0, 1, HandlerClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHandlerClause_Modifies(), this.getSlangModifies(), null, "modifies", null, 0, 1, HandlerClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHandlerClause_Assumes(), this.getAssumeStatement(), null, "assumes", null, 0, -1, HandlerClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHandlerClause_Guarantees(), this.getGuaranteeStatement(), null, "guarantees", null, 0, -1, HandlerClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHandlerClause_Cases(), this.getCaseStatementClause(), null, "cases", null, 0, -1, HandlerClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseStatementClauseEClass, CaseStatementClause.class, "CaseStatementClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCaseStatementClause_Id(), theEcorePackage.getEString(), "id", null, 0, 1, CaseStatementClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCaseStatementClause_Descriptor(), theEcorePackage.getEString(), "descriptor", null, 0, 1, CaseStatementClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaseStatementClause_AssumeStatement(), this.getAnonAssumeStatement(), null, "assumeStatement", null, 0, 1, CaseStatementClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaseStatementClause_GuaranteeStatement(), this.getAnonGuaranteeStatement(), null, "guaranteeStatement", null, 0, 1, CaseStatementClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specStatementEClass, SpecStatement.class, "SpecStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpecStatement_Id(), theEcorePackage.getEString(), "id", null, 0, 1, SpecStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpecStatement_Descriptor(), theEcorePackage.getEString(), "descriptor", null, 0, 1, SpecStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecStatement_Expr(), this.getOwnedExpression(), null, "expr", null, 0, 1, SpecStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assumeStatementEClass, AssumeStatement.class, "AssumeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anonAssumeStatementEClass, AnonAssumeStatement.class, "AnonAssumeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnonAssumeStatement_Expr(), this.getOwnedExpression(), null, "expr", null, 0, 1, AnonAssumeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(guaranteeStatementEClass, GuaranteeStatement.class, "GuaranteeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anonGuaranteeStatementEClass, AnonGuaranteeStatement.class, "AnonGuaranteeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnonGuaranteeStatement_Expr(), this.getOwnedExpression(), null, "expr", null, 0, 1, AnonGuaranteeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataElementEClass, DataElement.class, "DataElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataElement_DataElement(), theAadl2Package.getDataSubcomponentType(), null, "dataElement", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subcomponentElementEClass, SubcomponentElement.class, "SubcomponentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubcomponentElement_Subcomponent(), theAadl2Package.getSubcomponent(), null, "subcomponent", null, 0, 1, SubcomponentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionsEClass, Functions.class, "Functions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctions_Specs(), this.getFuncSpec(), null, "specs", null, 0, -1, Functions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(funcSpecEClass, FuncSpec.class, "FuncSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(slangDefDefEClass, SlangDefDef.class, "SlangDefDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSlangDefDef_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SlangDefDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangDefDef_TypeParams(), this.getSlangTypeParams(), null, "typeParams", null, 0, 1, SlangDefDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangDefDef_Params(), this.getSlangDefParams(), null, "params", null, 0, 1, SlangDefDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangDefDef_Type(), this.getSlangType(), null, "type", null, 0, 1, SlangDefDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangDefDef_MethodContract(), this.getSlangDefContract(), null, "methodContract", null, 0, 1, SlangDefDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangDefDef_Body(), this.getOwnedExpression(), null, "body", null, 0, 1, SlangDefDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangDefParamsEClass, SlangDefParams.class, "SlangDefParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangDefParams_Params(), this.getSlangDefParam(), null, "params", null, 0, -1, SlangDefParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangDefParamEClass, SlangDefParam.class, "SlangDefParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSlangDefParam_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SlangDefParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlangDefParam_IsMethodDef(), theEcorePackage.getEBoolean(), "isMethodDef", null, 0, 1, SlangDefParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangDefParam_TypeName(), this.getSlangType(), null, "typeName", null, 0, 1, SlangDefParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlangDefParam_IsVarArg(), theEcorePackage.getEBoolean(), "isVarArg", null, 0, 1, SlangDefParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangTypeParamsEClass, SlangTypeParams.class, "SlangTypeParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangTypeParams_TypeParam(), this.getSlangTypeParam(), null, "typeParam", null, 0, -1, SlangTypeParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangTypeParamEClass, SlangTypeParam.class, "SlangTypeParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSlangTypeParam_IsMut(), theEcorePackage.getEBoolean(), "isMut", null, 0, 1, SlangTypeParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlangTypeParam_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SlangTypeParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangDefContractEClass, SlangDefContract.class, "SlangDefContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangDefContract_Reads(), this.getSlangReads(), null, "reads", null, 0, 1, SlangDefContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangDefContract_Requires(), this.getSlangRequires(), null, "requires", null, 0, 1, SlangDefContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangDefContract_Modifies(), this.getSlangModifies(), null, "modifies", null, 0, 1, SlangDefContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangDefContract_Ensures(), this.getSlangEnsures(), null, "ensures", null, 0, 1, SlangDefContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangInvariantEClass, SlangInvariant.class, "SlangInvariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangInvariant_Exprs(), this.getOwnedExpression(), null, "exprs", null, 0, -1, SlangInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangRequiresEClass, SlangRequires.class, "SlangRequires", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangRequires_Exprs(), this.getOwnedExpression(), null, "exprs", null, 0, -1, SlangRequires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangReadsEClass, SlangReads.class, "SlangReads", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangReads_Exprs(), this.getOwnedExpression(), null, "exprs", null, 0, -1, SlangReads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangModifiesEClass, SlangModifies.class, "SlangModifies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangModifies_Exprs(), this.getOwnedExpression(), null, "exprs", null, 0, -1, SlangModifies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangEnsuresEClass, SlangEnsures.class, "SlangEnsures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangEnsures_Exprs(), this.getOwnedExpression(), null, "exprs", null, 0, -1, SlangEnsures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangTypeEClass, SlangType.class, "SlangType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangType_TypeName(), theAadl2Package.getDataSubcomponentType(), null, "typeName", null, 0, 1, SlangType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangStmtEClass, SlangStmt.class, "SlangStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(slangElseEClass, SlangElse.class, "SlangElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangElse_Cond(), this.getOwnedExpression(), null, "cond", null, 0, 1, SlangElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangElse_B(), this.getSlangBlock(), null, "b", null, 0, 1, SlangElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangElse_E(), this.getSlangElse(), null, "e", null, 0, 1, SlangElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangLoopContractEClass, SlangLoopContract.class, "SlangLoopContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangLoopContract_Inv(), this.getSlangInvariant(), null, "inv", null, 0, 1, SlangLoopContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangLoopContract_Mod(), this.getSlangModifies(), null, "mod", null, 0, 1, SlangLoopContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangCaseEClass, SlangCase.class, "SlangCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangCase_Pattern(), this.getSlangPattern(), null, "pattern", null, 0, 1, SlangCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangCase_E(), this.getOwnedExpression(), null, "e", null, 0, 1, SlangCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangCase_S(), this.getSlangStmt(), null, "s", null, 0, -1, SlangCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangPatternEClass, SlangPattern.class, "SlangPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangPattern_Patterns(), this.getSlangTPattern(), null, "patterns", null, 0, -1, SlangPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangPattern_TypeName(), this.getSlangType(), null, "typeName", null, 0, 1, SlangPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangPattern_Init(), this.getOwnedExpression(), null, "init", null, 0, 1, SlangPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangTPatternEClass, SlangTPattern.class, "SlangTPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangTPattern_Patterns(), this.getSlangTPattern(), null, "patterns", null, 0, -1, SlangTPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangTPattern_Type(), this.getSlangType(), null, "type", null, 0, 1, SlangTPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangVarDefEClass, SlangVarDef.class, "SlangVarDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangVarDef_D(), this.getSlangVarDef(), null, "d", null, 0, 1, SlangVarDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangBlockEClass, SlangBlock.class, "SlangBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangBlock_Stmts(), this.getSlangStmt(), null, "stmts", null, 0, -1, SlangBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangBlock_R(), this.getSlangRet(), null, "r", null, 0, 1, SlangBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ownedExpressionEClass, OwnedExpression.class, "OwnedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gExprEClass, GExpr.class, "GExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(quantRangeEClass, QuantRange.class, "QuantRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuantRange_Lo(), this.getOwnedExpression(), null, "lo", null, 0, 1, QuantRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuantRange_Extent(), theEcorePackage.getEString(), "extent", null, 0, 1, QuantRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantRange_High(), this.getOwnedExpression(), null, "high", null, 0, 1, QuantRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantParamEClass, QuantParam.class, "QuantParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuantParam_Name(), theEcorePackage.getEString(), "name", null, 0, 1, QuantParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantParam_TypeName(), this.getSlangType(), null, "typeName", null, 0, 1, QuantParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postfixEClass, Postfix.class, "Postfix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(memberAccessEClass, MemberAccess.class, "MemberAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMemberAccess_Field(), theEcorePackage.getEString(), "field", null, 0, 1, MemberAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayAccessEClass, ArrayAccess.class, "ArrayAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayAccess_Index(), this.getOwnedExpression(), null, "index", null, 0, -1, ArrayAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(otherDataRefEClass, OtherDataRef.class, "OtherDataRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOtherDataRef_NamedElement(), theAadl2Package.getNamedElement(), null, "namedElement", null, 0, 1, OtherDataRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOtherDataRef_ArrayRange(), theAadl2Package.getArrayRange(), null, "arrayRange", null, 0, -1, OtherDataRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOtherDataRef_Path(), this.getOtherDataRef(), null, "path", null, 0, 1, OtherDataRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangParamsEClass, SlangParams.class, "SlangParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangParams_Params(), this.getSlangParam(), null, "params", null, 0, -1, SlangParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangParamEClass, SlangParam.class, "SlangParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSlangParam_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SlangParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangParam_TypeName(), this.getSlangType(), null, "typeName", null, 0, 1, SlangParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangForRangeEClass, SlangForRange.class, "SlangForRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangForRange_E(), this.getOwnedExpression(), null, "e", null, 0, 1, SlangForRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangForRange_Upper(), this.getOwnedExpression(), null, "upper", null, 0, 1, SlangForRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangForRange_Step(), this.getOwnedExpression(), null, "step", null, 0, 1, SlangForRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangRetEClass, SlangRet.class, "SlangRet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangRet_E(), this.getOwnedExpression(), null, "e", null, 0, 1, SlangRet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangCallSuffixEClass, SlangCallSuffix.class, "SlangCallSuffix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangCallSuffix_Ca(), this.getSlangCallArgs(), null, "ca", null, 0, 1, SlangCallSuffix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangCallArgsEClass, SlangCallArgs.class, "SlangCallArgs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangCallArgs_Arg(), this.getOwnedExpression(), null, "arg", null, 0, -1, SlangCallArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangLitEClass, SlangLit.class, "SlangLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSlangLit_Value(), theEcorePackage.getEString(), "value", null, 0, 1, SlangLit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangInterpEClass, SlangInterp.class, "SlangInterp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(slangIfStmtEClass, SlangIfStmt.class, "SlangIfStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangIfStmt_Cond(), this.getOwnedExpression(), null, "cond", null, 0, 1, SlangIfStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangIfStmt_B(), this.getSlangBlock(), null, "b", null, 0, 1, SlangIfStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangIfStmt_E(), this.getSlangElse(), null, "e", null, 0, 1, SlangIfStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangWhileStmtEClass, SlangWhileStmt.class, "SlangWhileStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangWhileStmt_Cond(), this.getOwnedExpression(), null, "cond", null, 0, 1, SlangWhileStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangWhileStmt_L(), this.getSlangLoopContract(), null, "l", null, 0, 1, SlangWhileStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangWhileStmt_B(), this.getSlangBlock(), null, "b", null, 0, 1, SlangWhileStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangMatchStmtEClass, SlangMatchStmt.class, "SlangMatchStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangMatchStmt_TestExpr(), this.getOwnedExpression(), null, "testExpr", null, 0, 1, SlangMatchStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangMatchStmt_C(), this.getSlangCase(), null, "c", null, 0, -1, SlangMatchStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangSpecStmtEClass, SlangSpecStmt.class, "SlangSpecStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangSpecStmt_B(), this.getSlangBlock(), null, "b", null, 0, 1, SlangSpecStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangAssumeStmtEClass, SlangAssumeStmt.class, "SlangAssumeStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangAssumeStmt_E(), this.getOwnedExpression(), null, "e", null, 0, 1, SlangAssumeStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangAssertStmtEClass, SlangAssertStmt.class, "SlangAssertStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangAssertStmt_E(), this.getOwnedExpression(), null, "e", null, 0, 1, SlangAssertStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangHaltStmtEClass, SlangHaltStmt.class, "SlangHaltStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(slangDoStmtEClass, SlangDoStmt.class, "SlangDoStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangDoStmt_E(), this.getOwnedExpression(), null, "e", null, 0, 1, SlangDoStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifElseExpEClass, IfElseExp.class, "IfElseExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfElseExp_IfCond(), this.getGExpr(), null, "ifCond", null, 0, 1, IfElseExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfElseExp_ThenExpr(), this.getOwnedExpression(), null, "thenExpr", null, 0, 1, IfElseExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfElseExp_ElseExpr(), this.getOwnedExpression(), null, "elseExpr", null, 0, 1, IfElseExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantifiedExpEClass, QuantifiedExp.class, "QuantifiedExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuantifiedExp_Quantifier(), theEcorePackage.getEString(), "quantifier", null, 0, 1, QuantifiedExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantifiedExp_QuantRange(), this.getQuantRange(), null, "quantRange", null, 0, 1, QuantifiedExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantifiedExp_QuantParam(), this.getQuantParam(), null, "quantParam", null, 0, 1, QuantifiedExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuantifiedExp_QuantifiedExpr(), this.getOwnedExpression(), null, "quantifiedExpr", null, 0, 1, QuantifiedExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(impliesExprEClass, ImpliesExpr.class, "ImpliesExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImpliesExpr_Left(), this.getGExpr(), null, "left", null, 0, 1, ImpliesExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImpliesExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, ImpliesExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImpliesExpr_Right(), this.getGExpr(), null, "right", null, 0, 1, ImpliesExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orExprEClass, OrExpr.class, "OrExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrExpr_Left(), this.getGExpr(), null, "left", null, 0, 1, OrExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, OrExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrExpr_Right(), this.getGExpr(), null, "right", null, 0, 1, OrExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andExprEClass, AndExpr.class, "AndExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndExpr_Left(), this.getGExpr(), null, "left", null, 0, 1, AndExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAndExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, AndExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndExpr_Right(), this.getGExpr(), null, "right", null, 0, 1, AndExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalNotExprEClass, EqualNotExpr.class, "EqualNotExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEqualNotExpr_Left(), this.getGExpr(), null, "left", null, 0, 1, EqualNotExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEqualNotExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, EqualNotExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEqualNotExpr_Right(), this.getGExpr(), null, "right", null, 0, 1, EqualNotExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ltGtExprEClass, LtGtExpr.class, "LtGtExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLtGtExpr_Left(), this.getGExpr(), null, "left", null, 0, 1, LtGtExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLtGtExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, LtGtExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLtGtExpr_Right(), this.getGExpr(), null, "right", null, 0, 1, LtGtExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colonExprEClass, ColonExpr.class, "ColonExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColonExpr_Left(), this.getGExpr(), null, "left", null, 0, 1, ColonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColonExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, ColonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColonExpr_Right(), this.getGExpr(), null, "right", null, 0, 1, ColonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plusMinusExprEClass, PlusMinusExpr.class, "PlusMinusExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlusMinusExpr_Left(), this.getGExpr(), null, "left", null, 0, 1, PlusMinusExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlusMinusExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, PlusMinusExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlusMinusExpr_Right(), this.getGExpr(), null, "right", null, 0, 1, PlusMinusExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicativeExprEClass, MultiplicativeExpr.class, "MultiplicativeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplicativeExpr_Left(), this.getGExpr(), null, "left", null, 0, 1, MultiplicativeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplicativeExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, MultiplicativeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicativeExpr_Right(), this.getGExpr(), null, "right", null, 0, 1, MultiplicativeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExprEClass, UnaryExpr.class, "UnaryExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryExpr_Op(), theEcorePackage.getEString(), "op", null, 0, 1, UnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryExpr_Exp(), this.getGExpr(), null, "exp", null, 0, 1, UnaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postFixExprEClass, PostFixExpr.class, "PostFixExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPostFixExpr_BaseExp(), this.getGExpr(), null, "baseExp", null, 0, 1, PostFixExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPostFixExpr_Posts(), this.getPostfix(), null, "posts", null, 0, -1, PostFixExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangLitTermEClass, SlangLitTerm.class, "SlangLitTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangLitTerm_Lit(), this.getSlangLit(), null, "lit", null, 0, 1, SlangLitTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangInterpTermEClass, SlangInterpTerm.class, "SlangInterpTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangInterpTerm_I(), this.getSlangInterp(), null, "i", null, 0, 1, SlangInterpTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inStateExprEClass, InStateExpr.class, "InStateExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInStateExpr_StateVar(), this.getStateVarDecl(), null, "stateVar", null, 0, 1, InStateExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(maySendExprEClass, MaySendExpr.class, "MaySendExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMaySendExpr_EventPort(), theAadl2Package.getPort(), null, "eventPort", null, 0, 1, MaySendExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMaySendExpr_Value(), this.getOwnedExpression(), null, "value", null, 0, 1, MaySendExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mustSendExprEClass, MustSendExpr.class, "MustSendExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMustSendExpr_EventPort(), theAadl2Package.getPort(), null, "eventPort", null, 0, 1, MustSendExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMustSendExpr_Value(), this.getOwnedExpression(), null, "value", null, 0, 1, MustSendExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noSendExprEClass, NoSendExpr.class, "NoSendExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNoSendExpr_EventPort(), theAadl2Package.getPort(), null, "eventPort", null, 0, 1, NoSendExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hasEventExprEClass, HasEventExpr.class, "HasEventExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHasEventExpr_EventPort(), theAadl2Package.getPort(), null, "eventPort", null, 0, 1, HasEventExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumLitExprEClass, EnumLitExpr.class, "EnumLitExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumLitExpr_EnumType(), theAadl2Package.getDataClassifier(), null, "enumType", null, 0, 1, EnumLitExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumLitExpr_Value(), theAadl2Package.getStringLiteral(), null, "value", null, 0, 1, EnumLitExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parenExprEClass, ParenExpr.class, "ParenExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParenExpr_Exp(), this.getOwnedExpression(), null, "exp", null, 0, 1, ParenExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangForTermEClass, SlangForTerm.class, "SlangForTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangForTerm_R(), this.getSlangForRange(), null, "r", null, 0, -1, SlangForTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangForTerm_B(), this.getSlangBlock(), null, "b", null, 0, 1, SlangForTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangForTerm_E(), this.getOwnedExpression(), null, "e", null, 0, 1, SlangForTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slangBlockTermEClass, SlangBlockTerm.class, "SlangBlockTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlangBlockTerm_P(), this.getSlangParams(), null, "p", null, 0, 1, SlangBlockTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangBlockTerm_E(), this.getOwnedExpression(), null, "e", null, 0, 1, SlangBlockTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangBlockTerm_Stmt(), this.getSlangStmt(), null, "stmt", null, 0, -1, SlangBlockTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlangBlockTerm_R(), this.getSlangRet(), null, "r", null, 0, 1, SlangBlockTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(f32ObjEClass, F32Obj.class, "F32Obj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getF32Obj_Attr(), theEcorePackage.getEString(), "attr", null, 0, 1, F32Obj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(f64ObjEClass, F64Obj.class, "F64Obj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getF64Obj_Attr(), theEcorePackage.getEString(), "attr", null, 0, 1, F64Obj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callExprEClass, CallExpr.class, "CallExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCallExpr_Id(), theEcorePackage.getEObject(), null, "id", null, 0, 1, CallExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCallExpr_CallSuffix(), this.getSlangCallSuffix(), null, "callSuffix", null, 0, 1, CallExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recordLitExprEClass, RecordLitExpr.class, "RecordLitExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecordLitExpr_RecordType(), this.getDataElement(), null, "recordType", null, 0, 1, RecordLitExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecordLitExpr_Args(), theAadl2Package.getNamedElement(), null, "args", null, 0, -1, RecordLitExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecordLitExpr_ArgExpr(), this.getOwnedExpression(), null, "argExpr", null, 0, -1, RecordLitExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataRefExprEClass, DataRefExpr.class, "DataRefExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataRefExpr_PortOrSubcomponentOrStateVar(), theEcorePackage.getEObject(), null, "portOrSubcomponentOrStateVar", null, 0, 1, DataRefExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resultExprEClass, ResultExpr.class, "ResultExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanLitEClass, BooleanLit.class, "BooleanLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerLitEClass, IntegerLit.class, "IntegerLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(hexLitEClass, HexLit.class, "HexLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(binLitEClass, BinLit.class, "BinLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(f32LitEClass, F32Lit.class, "F32Lit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(f64LitEClass, F64Lit.class, "F64Lit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(slangStringLitEClass, SlangStringLit.class, "SlangStringLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(slangLiteralInterpEClass, SlangLiteralInterp.class, "SlangLiteralInterp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSlangLiteralInterp_Sli(), theEcorePackage.getEString(), "sli", null, 0, 1, SlangLiteralInterp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GumboPackageImpl
