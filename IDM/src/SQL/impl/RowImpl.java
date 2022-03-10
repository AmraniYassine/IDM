/**
 */
package SQL.impl;

import SQL.Column;
import SQL.Foreign_Key;
import SQL.Primary_key;
import SQL.Row;
import SQL.SQLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SQL.impl.RowImpl#getPrimary_key <em>Primary key</em>}</li>
 *   <li>{@link SQL.impl.RowImpl#getForeign_key <em>Foreign key</em>}</li>
 *   <li>{@link SQL.impl.RowImpl#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowImpl extends MinimalEObjectImpl.Container implements Row {
	/**
	 * The cached value of the '{@link #getPrimary_key() <em>Primary key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary_key()
	 * @generated
	 * @ordered
	 */
	protected Primary_key primary_key;

	/**
	 * The cached value of the '{@link #getForeign_key() <em>Foreign key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeign_key()
	 * @generated
	 * @ordered
	 */
	protected Foreign_Key foreign_key;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SQLPackage.Literals.ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primary_key getPrimary_key() {
		if (primary_key != null && primary_key.eIsProxy()) {
			InternalEObject oldPrimary_key = (InternalEObject)primary_key;
			primary_key = (Primary_key)eResolveProxy(oldPrimary_key);
			if (primary_key != oldPrimary_key) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQLPackage.ROW__PRIMARY_KEY, oldPrimary_key, primary_key));
			}
		}
		return primary_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primary_key basicGetPrimary_key() {
		return primary_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary_key(Primary_key newPrimary_key) {
		Primary_key oldPrimary_key = primary_key;
		primary_key = newPrimary_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLPackage.ROW__PRIMARY_KEY, oldPrimary_key, primary_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foreign_Key getForeign_key() {
		if (foreign_key != null && foreign_key.eIsProxy()) {
			InternalEObject oldForeign_key = (InternalEObject)foreign_key;
			foreign_key = (Foreign_Key)eResolveProxy(oldForeign_key);
			if (foreign_key != oldForeign_key) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SQLPackage.ROW__FOREIGN_KEY, oldForeign_key, foreign_key));
			}
		}
		return foreign_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foreign_Key basicGetForeign_key() {
		return foreign_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeign_key(Foreign_Key newForeign_key) {
		Foreign_Key oldForeign_key = foreign_key;
		foreign_key = newForeign_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLPackage.ROW__FOREIGN_KEY, oldForeign_key, foreign_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<Column>(Column.class, this, SQLPackage.ROW__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SQLPackage.ROW__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SQLPackage.ROW__PRIMARY_KEY:
				if (resolve) return getPrimary_key();
				return basicGetPrimary_key();
			case SQLPackage.ROW__FOREIGN_KEY:
				if (resolve) return getForeign_key();
				return basicGetForeign_key();
			case SQLPackage.ROW__COLUMN:
				return getColumn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SQLPackage.ROW__PRIMARY_KEY:
				setPrimary_key((Primary_key)newValue);
				return;
			case SQLPackage.ROW__FOREIGN_KEY:
				setForeign_key((Foreign_Key)newValue);
				return;
			case SQLPackage.ROW__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SQLPackage.ROW__PRIMARY_KEY:
				setPrimary_key((Primary_key)null);
				return;
			case SQLPackage.ROW__FOREIGN_KEY:
				setForeign_key((Foreign_Key)null);
				return;
			case SQLPackage.ROW__COLUMN:
				getColumn().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SQLPackage.ROW__PRIMARY_KEY:
				return primary_key != null;
			case SQLPackage.ROW__FOREIGN_KEY:
				return foreign_key != null;
			case SQLPackage.ROW__COLUMN:
				return column != null && !column.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RowImpl
