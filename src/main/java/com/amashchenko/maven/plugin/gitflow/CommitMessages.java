/*
 * Copyright 2014-2018 Aleksandr Mashchenko.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amashchenko.maven.plugin.gitflow;

/**
 * Git commit messages.
 * 
 */
public class CommitMessages {
    private String featureStartMessage;
    private String featureFinishMessage;
    private String featureMergeMessage;

    private String hotfixStartMessage;
    private String hotfixFinishMessage;
    private String hotfixMergeMessage;

    private String hotfixVersionUpdateMessage;

    private String releaseStartMessage;
    private String releaseFinishMessage;
    private String releaseMergeMessage;

    private String releaseVersionUpdateMessage;

    private String tagHotfixMessage;
    private String tagReleaseMessage;

    public CommitMessages() {
        featureStartMessage = "Update versions for feature branch";
        featureFinishMessage = "Update versions for development branch";
        featureMergeMessage = "Merge branch '@{sourceBranch}'";

        hotfixStartMessage = "Update versions for hotfix";
        hotfixFinishMessage = "Update for next development version";
        hotfixMergeMessage = "Merge branch '@{sourceBranch}'";

        hotfixVersionUpdateMessage = "Update to hotfix version";

        releaseStartMessage = "Update versions for release";
        releaseFinishMessage = "Update for next development version";
        releaseMergeMessage = "Merge branch '@{sourceBranch}'";

        releaseVersionUpdateMessage = "Update for next development version";

        tagHotfixMessage = "Tag hotfix";
        tagReleaseMessage = "Tag release";
    }

    /**
     * @return the featureStartMessage
     */
    public String getFeatureStartMessage() {
        return featureStartMessage;
    }

    /**
     * @param featureStartMessage
     *            the featureStartMessage to set
     */
    public void setFeatureStartMessage(String featureStartMessage) {
        this.featureStartMessage = featureStartMessage;
    }

    /**
     * @return the featureFinishMessage
     */
    public String getFeatureFinishMessage() {
        return featureFinishMessage;
    }

    /**
     * @param featureFinishMessage
     *            the featureFinishMessage to set
     */
    public void setFeatureFinishMessage(String featureFinishMessage) {
        this.featureFinishMessage = featureFinishMessage;
    }

    /**
     * @return the featureMergeMessage
     */
    public String getFeatureMergeMessage() {
        return featureMergeMessage;
    }

    /**
     * @param featureMergeMessage
     *            the featureMergeMessage to set
     */
    public void setFeatureMergeMessage(String featureMergeMessage) {
        this.featureMergeMessage = featureMergeMessage;
    }

    /**
     * @return the hotfixStartMessage
     */
    public String getHotfixStartMessage() {
        return hotfixStartMessage;
    }

    /**
     * @param hotfixStartMessage
     *            the hotfixStartMessage to set
     */
    public void setHotfixStartMessage(String hotfixStartMessage) {
        this.hotfixStartMessage = hotfixStartMessage;
    }

    /**
     * @return the hotfixFinishMessage
     */
    public String getHotfixFinishMessage() {
        return hotfixFinishMessage;
    }

    /**
     * @param hotfixFinishMessage
     *            the hotfixFinishMessage to set
     */
    public void setHotfixFinishMessage(String hotfixFinishMessage) {
        this.hotfixFinishMessage = hotfixFinishMessage;
    }

    /**
     * @return the hotfixMergeMessage
     */
    public String getHotfixMergeMessage() {
        return hotfixMergeMessage;
    }

    /**
     * @param hotfixMergeMessage
     *            the hotfixMergeMessage to set
     */
    public void setHotfixMergeMessage(String hotfixMergeMessage) {
        this.hotfixMergeMessage = hotfixMergeMessage;
    }

    public String getHotfixVersionUpdateMessage() {
        return hotfixVersionUpdateMessage;
    }

    public void setHotfixVersionUpdateMessage(String hotfixVersionUpdateMessage) {
        this.hotfixVersionUpdateMessage = hotfixVersionUpdateMessage;
    }

    /**
     * @return the releaseStartMessage
     */
    public String getReleaseStartMessage() {
        return releaseStartMessage;
    }

    /**
     * @param releaseStartMessage
     *            the releaseStartMessage to set
     */
    public void setReleaseStartMessage(String releaseStartMessage) {
        this.releaseStartMessage = releaseStartMessage;
    }

    /**
     * @return the releaseFinishMessage
     */
    public String getReleaseFinishMessage() {
        return releaseFinishMessage;
    }

    /**
     * @param releaseFinishMessage
     *            the releaseFinishMessage to set
     */
    public void setReleaseFinishMessage(String releaseFinishMessage) {
        this.releaseFinishMessage = releaseFinishMessage;
    }

    /**
     * @return the releaseMergeMessage
     */
    public String getReleaseMergeMessage() {
        return releaseMergeMessage;
    }

    /**
     * @param releaseMergeMessage
     *            the releaseMergeMessage to set
     */
    public void setReleaseMergeMessage(String releaseMergeMessage) {
        this.releaseMergeMessage = releaseMergeMessage;
    }

    public String getReleaseVersionUpdateMessage() {
        return releaseVersionUpdateMessage;
    }

    public void setReleaseVersionUpdateMessage(String releaseVersionUpdateMessage) {
        this.releaseVersionUpdateMessage = releaseVersionUpdateMessage;
    }

    /**
     * @return the tagHotfixMessage
     */
    public String getTagHotfixMessage() {
        return tagHotfixMessage;
    }

    /**
     * @param tagHotfixMessage
     *            the tagHotfixMessage to set
     */
    public void setTagHotfixMessage(String tagHotfixMessage) {
        this.tagHotfixMessage = tagHotfixMessage;
    }

    /**
     * @return the tagReleaseMessage
     */
    public String getTagReleaseMessage() {
        return tagReleaseMessage;
    }

    /**
     * @param tagReleaseMessage
     *            the tagReleaseMessage to set
     */
    public void setTagReleaseMessage(String tagReleaseMessage) {
        this.tagReleaseMessage = tagReleaseMessage;
    }
}
