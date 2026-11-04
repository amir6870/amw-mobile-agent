package com.amw.mobileagent

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

/**
 * Minimal AccessibilityService that performs no clicks, gestures,
 * text entry, screenshots, or network transmission.
 * It exists as a stub to demonstrate the service structure.
 */
class AgentAccessibilityService : AccessibilityService() {

    override fun onInterrupt() {
        // No-op
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // No-op: do not process or forward event data
    }
}
