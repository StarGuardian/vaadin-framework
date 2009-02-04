package com.itmill.toolkit.demo.sampler.features.accordions;

import com.itmill.toolkit.terminal.ThemeResource;
import com.itmill.toolkit.ui.Accordion;
import com.itmill.toolkit.ui.HorizontalLayout;
import com.itmill.toolkit.ui.Label;
import com.itmill.toolkit.ui.TabSheet.SelectedTabChangeEvent;

public class AccordionIconsExample extends HorizontalLayout implements
        Accordion.SelectedTabChangeListener {

    private static final ThemeResource icon1 = new ThemeResource(
            "icons/action_save.gif");
    private static final ThemeResource icon2 = new ThemeResource(
            "icons/comment_yellow.gif");
    private static final ThemeResource icon3 = new ThemeResource(
            "icons/icon_info.gif");

    private Accordion a;

    public AccordionIconsExample() {
        setSpacing(true);

        Label l1 = new Label("There are no previously saved actions.");
        Label l2 = new Label("There are no saved notes.");
        Label l3 = new Label("There are currently no issues.");

        a = new Accordion();
        a.setHeight("300px");
        a.setWidth("400px");
        a.addTab(l1, "Saved actions", icon1);
        a.addTab(l2, "Notes", icon2);
        a.addTab(l3, "Issues", icon3);
        a.addListener(this);

        addComponent(a);
    }

    public void selectedTabChange(SelectedTabChangeEvent event) {
        String c = a.getTabCaption(event.getTabSheet().getSelectedTab());
        getWindow().showNotification("Selected tab: " + c);
    }
}
