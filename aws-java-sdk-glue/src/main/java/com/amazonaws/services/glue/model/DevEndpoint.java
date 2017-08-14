/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A development endpoint where a developer can remotely debug ETL scripts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DevEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DevEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the DevEndpoint.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The AWS ARN of the IAM role used in this DevEndpoint.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A list of security group identifiers used in this DevEndpoint.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The subnet ID for this DevEndpoint.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The YARN endpoint address used by this DevEndpoint.
     * </p>
     */
    private String yarnEndpointAddress;
    /**
     * <p>
     * The public address used by this DevEndpoint.
     * </p>
     */
    private String publicAddress;
    /**
     * <p>
     * The current status of this DevEndpoint.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The number of nodes used by this DevEndpoint.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * The AWS availability zone where this DevEndpoint is located.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this DevEndpoint.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Path to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     */
    private String extraPythonLibsS3Path;
    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     */
    private String extraJarsS3Path;
    /**
     * <p>
     * The reason for a current failure in this DevEndpoint.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The status of the last update.
     * </p>
     */
    private String lastUpdateStatus;
    /**
     * <p>
     * The point in time at which this DevEndpoint was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The point in time at which this DevEndpoint was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;
    /**
     * <p>
     * The public key to be used by this DevEndpoint for authentication.
     * </p>
     */
    private String publicKey;

    /**
     * <p>
     * The name of the DevEndpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of the DevEndpoint.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the DevEndpoint.
     * </p>
     * 
     * @return The name of the DevEndpoint.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the DevEndpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of the DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The AWS ARN of the IAM role used in this DevEndpoint.
     * </p>
     * 
     * @param roleArn
     *        The AWS ARN of the IAM role used in this DevEndpoint.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The AWS ARN of the IAM role used in this DevEndpoint.
     * </p>
     * 
     * @return The AWS ARN of the IAM role used in this DevEndpoint.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The AWS ARN of the IAM role used in this DevEndpoint.
     * </p>
     * 
     * @param roleArn
     *        The AWS ARN of the IAM role used in this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A list of security group identifiers used in this DevEndpoint.
     * </p>
     * 
     * @return A list of security group identifiers used in this DevEndpoint.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of security group identifiers used in this DevEndpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group identifiers used in this DevEndpoint.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of security group identifiers used in this DevEndpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group identifiers used in this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security group identifiers used in this DevEndpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of security group identifiers used in this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The subnet ID for this DevEndpoint.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID for this DevEndpoint.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID for this DevEndpoint.
     * </p>
     * 
     * @return The subnet ID for this DevEndpoint.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet ID for this DevEndpoint.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID for this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The YARN endpoint address used by this DevEndpoint.
     * </p>
     * 
     * @param yarnEndpointAddress
     *        The YARN endpoint address used by this DevEndpoint.
     */

    public void setYarnEndpointAddress(String yarnEndpointAddress) {
        this.yarnEndpointAddress = yarnEndpointAddress;
    }

    /**
     * <p>
     * The YARN endpoint address used by this DevEndpoint.
     * </p>
     * 
     * @return The YARN endpoint address used by this DevEndpoint.
     */

    public String getYarnEndpointAddress() {
        return this.yarnEndpointAddress;
    }

    /**
     * <p>
     * The YARN endpoint address used by this DevEndpoint.
     * </p>
     * 
     * @param yarnEndpointAddress
     *        The YARN endpoint address used by this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withYarnEndpointAddress(String yarnEndpointAddress) {
        setYarnEndpointAddress(yarnEndpointAddress);
        return this;
    }

    /**
     * <p>
     * The public address used by this DevEndpoint.
     * </p>
     * 
     * @param publicAddress
     *        The public address used by this DevEndpoint.
     */

    public void setPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
    }

    /**
     * <p>
     * The public address used by this DevEndpoint.
     * </p>
     * 
     * @return The public address used by this DevEndpoint.
     */

    public String getPublicAddress() {
        return this.publicAddress;
    }

    /**
     * <p>
     * The public address used by this DevEndpoint.
     * </p>
     * 
     * @param publicAddress
     *        The public address used by this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withPublicAddress(String publicAddress) {
        setPublicAddress(publicAddress);
        return this;
    }

    /**
     * <p>
     * The current status of this DevEndpoint.
     * </p>
     * 
     * @param status
     *        The current status of this DevEndpoint.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of this DevEndpoint.
     * </p>
     * 
     * @return The current status of this DevEndpoint.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of this DevEndpoint.
     * </p>
     * 
     * @param status
     *        The current status of this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The number of nodes used by this DevEndpoint.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of nodes used by this DevEndpoint.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes used by this DevEndpoint.
     * </p>
     * 
     * @return The number of nodes used by this DevEndpoint.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The number of nodes used by this DevEndpoint.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of nodes used by this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * The AWS availability zone where this DevEndpoint is located.
     * </p>
     * 
     * @param availabilityZone
     *        The AWS availability zone where this DevEndpoint is located.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The AWS availability zone where this DevEndpoint is located.
     * </p>
     * 
     * @return The AWS availability zone where this DevEndpoint is located.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The AWS availability zone where this DevEndpoint is located.
     * </p>
     * 
     * @param availabilityZone
     *        The AWS availability zone where this DevEndpoint is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this DevEndpoint.
     * </p>
     * 
     * @param vpcId
     *        The ID of the virtual private cloud (VPC) used by this DevEndpoint.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this DevEndpoint.
     * </p>
     * 
     * @return The ID of the virtual private cloud (VPC) used by this DevEndpoint.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) used by this DevEndpoint.
     * </p>
     * 
     * @param vpcId
     *        The ID of the virtual private cloud (VPC) used by this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Path to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * 
     * @param extraPythonLibsS3Path
     *        Path to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     */

    public void setExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    /**
     * <p>
     * Path to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * 
     * @return Path to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     */

    public String getExtraPythonLibsS3Path() {
        return this.extraPythonLibsS3Path;
    }

    /**
     * <p>
     * Path to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * 
     * @param extraPythonLibsS3Path
     *        Path to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        setExtraPythonLibsS3Path(extraPythonLibsS3Path);
        return this;
    }

    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * 
     * @param extraJarsS3Path
     *        Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     */

    public void setExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * 
     * @return Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     */

    public String getExtraJarsS3Path() {
        return this.extraJarsS3Path;
    }

    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * 
     * @param extraJarsS3Path
     *        Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withExtraJarsS3Path(String extraJarsS3Path) {
        setExtraJarsS3Path(extraJarsS3Path);
        return this;
    }

    /**
     * <p>
     * The reason for a current failure in this DevEndpoint.
     * </p>
     * 
     * @param failureReason
     *        The reason for a current failure in this DevEndpoint.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason for a current failure in this DevEndpoint.
     * </p>
     * 
     * @return The reason for a current failure in this DevEndpoint.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason for a current failure in this DevEndpoint.
     * </p>
     * 
     * @param failureReason
     *        The reason for a current failure in this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The status of the last update.
     * </p>
     * 
     * @param lastUpdateStatus
     *        The status of the last update.
     */

    public void setLastUpdateStatus(String lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus;
    }

    /**
     * <p>
     * The status of the last update.
     * </p>
     * 
     * @return The status of the last update.
     */

    public String getLastUpdateStatus() {
        return this.lastUpdateStatus;
    }

    /**
     * <p>
     * The status of the last update.
     * </p>
     * 
     * @param lastUpdateStatus
     *        The status of the last update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withLastUpdateStatus(String lastUpdateStatus) {
        setLastUpdateStatus(lastUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The point in time at which this DevEndpoint was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The point in time at which this DevEndpoint was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The point in time at which this DevEndpoint was created.
     * </p>
     * 
     * @return The point in time at which this DevEndpoint was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The point in time at which this DevEndpoint was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The point in time at which this DevEndpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The point in time at which this DevEndpoint was last modified.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The point in time at which this DevEndpoint was last modified.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The point in time at which this DevEndpoint was last modified.
     * </p>
     * 
     * @return The point in time at which this DevEndpoint was last modified.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The point in time at which this DevEndpoint was last modified.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The point in time at which this DevEndpoint was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The public key to be used by this DevEndpoint for authentication.
     * </p>
     * 
     * @param publicKey
     *        The public key to be used by this DevEndpoint for authentication.
     */

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key to be used by this DevEndpoint for authentication.
     * </p>
     * 
     * @return The public key to be used by this DevEndpoint for authentication.
     */

    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The public key to be used by this DevEndpoint for authentication.
     * </p>
     * 
     * @param publicKey
     *        The public key to be used by this DevEndpoint for authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevEndpoint withPublicKey(String publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getYarnEndpointAddress() != null)
            sb.append("YarnEndpointAddress: ").append(getYarnEndpointAddress()).append(",");
        if (getPublicAddress() != null)
            sb.append("PublicAddress: ").append(getPublicAddress()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getExtraPythonLibsS3Path() != null)
            sb.append("ExtraPythonLibsS3Path: ").append(getExtraPythonLibsS3Path()).append(",");
        if (getExtraJarsS3Path() != null)
            sb.append("ExtraJarsS3Path: ").append(getExtraJarsS3Path()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getLastUpdateStatus() != null)
            sb.append("LastUpdateStatus: ").append(getLastUpdateStatus()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DevEndpoint == false)
            return false;
        DevEndpoint other = (DevEndpoint) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getYarnEndpointAddress() == null ^ this.getYarnEndpointAddress() == null)
            return false;
        if (other.getYarnEndpointAddress() != null && other.getYarnEndpointAddress().equals(this.getYarnEndpointAddress()) == false)
            return false;
        if (other.getPublicAddress() == null ^ this.getPublicAddress() == null)
            return false;
        if (other.getPublicAddress() != null && other.getPublicAddress().equals(this.getPublicAddress()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getExtraPythonLibsS3Path() == null ^ this.getExtraPythonLibsS3Path() == null)
            return false;
        if (other.getExtraPythonLibsS3Path() != null && other.getExtraPythonLibsS3Path().equals(this.getExtraPythonLibsS3Path()) == false)
            return false;
        if (other.getExtraJarsS3Path() == null ^ this.getExtraJarsS3Path() == null)
            return false;
        if (other.getExtraJarsS3Path() != null && other.getExtraJarsS3Path().equals(this.getExtraJarsS3Path()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getLastUpdateStatus() == null ^ this.getLastUpdateStatus() == null)
            return false;
        if (other.getLastUpdateStatus() != null && other.getLastUpdateStatus().equals(this.getLastUpdateStatus()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getYarnEndpointAddress() == null) ? 0 : getYarnEndpointAddress().hashCode());
        hashCode = prime * hashCode + ((getPublicAddress() == null) ? 0 : getPublicAddress().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getExtraPythonLibsS3Path() == null) ? 0 : getExtraPythonLibsS3Path().hashCode());
        hashCode = prime * hashCode + ((getExtraJarsS3Path() == null) ? 0 : getExtraJarsS3Path().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateStatus() == null) ? 0 : getLastUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        return hashCode;
    }

    @Override
    public DevEndpoint clone() {
        try {
            return (DevEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DevEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
