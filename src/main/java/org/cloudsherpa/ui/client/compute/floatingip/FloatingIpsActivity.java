package org.cloudsherpa.ui.client.compute.floatingip;

import org.cloudsherpa.portal.client.Portal;
import org.cloudsherpa.ui.client.compute.common.PortalPlace;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class FloatingIpsActivity extends AbstractActivity implements FloatingIpsView.Presenter {
	
	public static final FloatingIpsView VIEW = new FloatingIpsView();

	private PortalPlace place;

	public FloatingIpsActivity(PortalPlace place) {
		this.place = place;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		VIEW.setPresenter(this);
		panel.setWidget(VIEW);
	}

	@Override
	public void onCreate() {
		
		
	}

	@Override
	public void onDelete() {
		onRefresh();
		
	}

	@Override
	public void onRefresh() {
		
	}

	@Override
	public void onAssociate() {
		AssociateFloatingIp widget = new AssociateFloatingIp();
		Portal.MODAL.setWidget(widget);
		Portal.MODAL.center();
		
	}

	@Override
	public void onDisassociate() {
		
	}

}
