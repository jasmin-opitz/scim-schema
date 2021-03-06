/*
 * Copyright (C) 2013 tarent AG
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.osiam.resources.scim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonUnwrapped;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.ser.BeanSerializer;


/**
 * <p>Java class for User complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class User extends CoreResource {

    private String userName;
    private Name name;
    private String displayName;
    private String nickName;
    private String profileUrl;
    private String title;
    private String userType;
    private String preferredLanguage;
    private String locale;
    private String timezone;
    private Boolean active;
    private String password;
    private List<MultiValuedAttribute> emails = new ArrayList<>();
    private List<MultiValuedAttribute> phoneNumbers = new ArrayList<>();
    private List<MultiValuedAttribute> ims = new ArrayList<>();
    private List<MultiValuedAttribute> photos = new ArrayList<>();
    private List<Address> addresses = new ArrayList<>();
    private List<MultiValuedAttribute> groups = new ArrayList<>();
    private List<MultiValuedAttribute> entitlements = new ArrayList<>();
    private List<MultiValuedAttribute> roles = new ArrayList<>();
    private List<MultiValuedAttribute> x509Certificates = new ArrayList<>();
    private Map<String, Extension> extensions = new HashMap<>();

    public User() {
    }

    private User(Builder builder) {
        super(builder);
        this.userName = builder.userName;
        this.name = builder.name;
        this.displayName = builder.displayName;
        this.nickName = builder.nickName;
        this.profileUrl = builder.profileUrl;
        this.title = builder.title;
        this.userType = builder.userType;
        this.preferredLanguage = builder.preferredLanguage;
        this.locale = builder.locale;
        this.timezone = builder.timezone;
        this.active = builder.active;
        this.password = builder.password;

        this.emails = builder.emails;
        this.phoneNumbers = builder.phoneNumbers;
        this.ims = builder.ims;
        this.photos = builder.photos;
        this.addresses = builder.addresses;
        this.groups = builder.groups;
        this.entitlements = builder.entitlements;
        this.roles = builder.roles;
        this.x509Certificates = builder.x509Certificates;
        this.extensions = builder.extensions;
    }

    /**
     * Gets the value of the userName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     *         {@link Name }
     */
    public Name getName() {
        return name;
    }

    /**
     * Gets the value of the displayName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Gets the value of the nickName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Gets the value of the profileUrl property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * Gets the value of the title property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the value of the userType property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Gets the value of the preferredLanguage property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Gets the value of the locale property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Gets the value of the timezone property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Gets the value of the active property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Gets the value of the password property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPassword() {
        return password;
    }

    public List<MultiValuedAttribute> getEmails() {
        return emails;
    }

    public List<MultiValuedAttribute> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<MultiValuedAttribute> getIms() {
        return ims;
    }

    public List<MultiValuedAttribute> getPhotos() {
        return photos;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public List<MultiValuedAttribute> getGroups() {
        return groups;
    }

    public List<MultiValuedAttribute> getEntitlements() {
        return entitlements;
    }

    public List<MultiValuedAttribute> getRoles() {
        return roles;
    }

    public List<MultiValuedAttribute> getX509Certificates() {
        return x509Certificates;
    }

    /**
     * Provides an unmodifiable view of the extensions as a map
     * @return an unmodifiable view of the extensions
     */
    @JsonAnyGetter
    public Map<String, Extension> getAllExtensions() {
        return Collections.unmodifiableMap(extensions);
    }

    /**
     * Provides the extension with the given URN
     * @param urn The URN of the extension
     * @return The extension for the given URN
     * @throws IllegalArgumentException If urn is null or empty
     * @throws NoSuchElementException If extension with given urn is not available
     */
    public Extension getExtension(String urn) {
        if (urn == null || urn.isEmpty()) {
            throw new IllegalArgumentException("urn must be neither null nor empty");
        }

        if (!extensions.containsKey(urn)) {
            throw new NoSuchElementException("extension " + urn + " is not available");
        }

        return extensions.get(urn);
    }

    public static class Builder extends CoreResource.Builder {
        private String userName;
        private String password;
        private Boolean active;
        private String timezone;
        private String locale;
        private String preferredLanguage;
        private String userType;
        private String title;
        private String profileUrl;
        private String nickName;
        private String displayName;
        private Name name;
        private List<MultiValuedAttribute> emails = new ArrayList<>();
        private List<MultiValuedAttribute> phoneNumbers = new ArrayList<>();
        private List<MultiValuedAttribute> ims = new ArrayList<>();
        private List<MultiValuedAttribute> photos = new ArrayList<>();
        private List<Address> addresses = new ArrayList<>();
        private List<MultiValuedAttribute> groups = new ArrayList<>();
        private List<MultiValuedAttribute> entitlements = new ArrayList<>();
        private List<MultiValuedAttribute> roles = new ArrayList<>();
        private List<MultiValuedAttribute> x509Certificates = new ArrayList<>();
        private Map<String, Extension> extensions = new HashMap<>();

        /**
         * This class is for generating the output of an User. It does not copy the password.
         *
         * @param user
         * @return new (filtered) {@link User} object
         */
        public static User generateForOutput(User user) {
            if (user == null) {
                return null;
            }

            Builder builder = new Builder(user);
            builder.setPassword(null);
            return builder.build();
        }

        public Builder(String userName) {
            if (userName == null || userName.isEmpty()) { throw new IllegalArgumentException("userName must not be null or empty."); }
            this.userName = userName;
        }

        public Builder() {}

        public Builder(User user){
            this.userName = user.userName;
            this.name = user.name;
            this.displayName = user.displayName;
            this.nickName = user.nickName;
            this.profileUrl = user.profileUrl;
            this.title = user.title;
            this.userType = user.userType;
            this.preferredLanguage = user.preferredLanguage;
            this.locale = user.locale;
            this.timezone = user.timezone;
            this.active = user.active;
            this.password = user.password;
            this.emails = user.emails != null ? user.emails: this.emails;
            this.phoneNumbers = user.phoneNumbers != null ? user.phoneNumbers : this.phoneNumbers;
            this.ims = user.ims != null ? user.ims : this.ims;
            this.photos = user.photos != null ? user.photos : this.photos;
            this.addresses = user.addresses != null ? user.addresses : this.addresses;
            this.groups = user.groups != null ? user.groups : this.groups;
            this.entitlements = user.entitlements != null ? user.entitlements : this.entitlements;
            this.roles = user.roles != null ? user.roles : this.roles;
            this.x509Certificates = user.x509Certificates != null ? user.x509Certificates : this.x509Certificates;
            this.extensions = user.extensions != null ? user.extensions : this.extensions;
            this.externalId = user.getExternalId();
            this.id = user.getId();
            this.meta = user.getMeta();
            this.schemas = user.getSchemas();
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public Builder setProfileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setUserType(String userType) {
            this.userType = userType;
            return this;
        }

        public Builder setPreferredLanguage(String preferredLanguage) {
            this.preferredLanguage = preferredLanguage;
            return this;
        }

        public Builder setLocale(String locale) {
            this.locale = locale;
            return this;
        }

        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setActive(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setEmails(List<MultiValuedAttribute> emails) {
            this.emails = emails;
            return this;
        }

        public Builder setPhoneNumbers(List<MultiValuedAttribute> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        public Builder setIms(List<MultiValuedAttribute> ims) {
            this.ims = ims;
            return this;
        }

        public Builder setPhotos(List<MultiValuedAttribute> photos) {
            this.photos = photos;
            return this;
        }

        public Builder setAddresses(List<Address> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder setGroups(List<MultiValuedAttribute> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setEntitlements(List<MultiValuedAttribute> entitlements) {
            this.entitlements = entitlements;
            return this;
        }

        public Builder setRoles(List<MultiValuedAttribute> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setX509Certificates(List<MultiValuedAttribute> x509Certificates) {
            this.x509Certificates = x509Certificates;
            return this;
        }

        public Builder addExtension(String urn, Extension extension) {
            extensions.put(urn, extension);
            schemas.add(urn);
            return this;
        }

        @Override
        public User build() {
            return new User(this);
        }
    }
}
