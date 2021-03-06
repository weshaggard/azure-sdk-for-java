/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineImages;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineImageResource;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineImage;

class VirtualMachineImagesImpl extends WrapperImpl<VirtualMachineImagesInner> implements VirtualMachineImages {
    private final ComputeManager manager;

    VirtualMachineImagesImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineImages());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    private VirtualMachineImageResourceImpl wrapVirtualMachineImageResourceModel(VirtualMachineImageResourceInner inner) {
        return  new VirtualMachineImageResourceImpl(inner, manager());
    }

    private VirtualMachineImageImpl wrapVirtualMachineImageModel(VirtualMachineImageInner inner) {
        return  new VirtualMachineImageImpl(inner, manager());
    }

    private Observable<VirtualMachineImageInner> getVirtualMachineImageInnerUsingVirtualMachineImagesInnerAsync(String id) {
        String location = IdParsingUtils.getValueFromIdByName(id, "locations");
        String publisherName = IdParsingUtils.getValueFromIdByName(id, "publishers");
        String offer = IdParsingUtils.getValueFromIdByName(id, "offers");
        String skus = IdParsingUtils.getValueFromIdByName(id, "skus");
        String version = IdParsingUtils.getValueFromIdByName(id, "versions");
        VirtualMachineImagesInner client = this.inner();
        return client.getAsync(location, publisherName, offer, skus, version);
    }

    @Override
    public Observable<VirtualMachineImageResource> listPublishersAsync(String location) {
        VirtualMachineImagesInner client = this.inner();
        return client.listPublishersAsync(location)
        .flatMap(new Func1<List<VirtualMachineImageResourceInner>, Observable<VirtualMachineImageResourceInner>>() {
            @Override
            public Observable<VirtualMachineImageResourceInner> call(List<VirtualMachineImageResourceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VirtualMachineImageResourceInner, VirtualMachineImageResource>() {
            @Override
            public VirtualMachineImageResource call(VirtualMachineImageResourceInner inner) {
                return wrapVirtualMachineImageResourceModel(inner);
            }
        });
    }

    @Override
    public Observable<VirtualMachineImage> getAsync(String location, String publisherName, String offer, String skus, String version) {
        VirtualMachineImagesInner client = this.inner();
        return client.getAsync(location, publisherName, offer, skus, version)
        .flatMap(new Func1<VirtualMachineImageInner, Observable<VirtualMachineImage>>() {
            @Override
            public Observable<VirtualMachineImage> call(VirtualMachineImageInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((VirtualMachineImage)wrapVirtualMachineImageModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<VirtualMachineImage> listAsync(String location, String publisherName, String offer, String skus) {
        VirtualMachineImagesInner client = this.inner();
        return client.listAsync(location, publisherName, offer, skus)
        .flatMap(new Func1<List<VirtualMachineImageResourceInner>, Observable<VirtualMachineImageResourceInner>>() {
            @Override
            public Observable<VirtualMachineImageResourceInner> call(List<VirtualMachineImageResourceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .flatMap(new Func1<VirtualMachineImageResourceInner, Observable<VirtualMachineImageInner>>() {
            @Override
            public Observable<VirtualMachineImageInner> call(VirtualMachineImageResourceInner inner) {
                return getVirtualMachineImageInnerUsingVirtualMachineImagesInnerAsync(inner.id());
            }
        })
        .map(new Func1<VirtualMachineImageInner, VirtualMachineImage>() {
            @Override
            public VirtualMachineImage call(VirtualMachineImageInner inner) {
                return wrapVirtualMachineImageModel(inner);
            }
        });
    }

    @Override
    public Observable<VirtualMachineImageResource> listOffersAsync(String location, String publisherName) {
        VirtualMachineImagesInner client = this.inner();
        return client.listOffersAsync(location, publisherName)
        .flatMap(new Func1<List<VirtualMachineImageResourceInner>, Observable<VirtualMachineImageResourceInner>>() {
            @Override
            public Observable<VirtualMachineImageResourceInner> call(List<VirtualMachineImageResourceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VirtualMachineImageResourceInner, VirtualMachineImageResource>() {
            @Override
            public VirtualMachineImageResource call(VirtualMachineImageResourceInner inner) {
                return new VirtualMachineImageResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<VirtualMachineImageResource> listSkusAsync(String location, String publisherName, String offer) {
        VirtualMachineImagesInner client = this.inner();
        return client.listSkusAsync(location, publisherName, offer)
        .flatMap(new Func1<List<VirtualMachineImageResourceInner>, Observable<VirtualMachineImageResourceInner>>() {
            @Override
            public Observable<VirtualMachineImageResourceInner> call(List<VirtualMachineImageResourceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VirtualMachineImageResourceInner, VirtualMachineImageResource>() {
            @Override
            public VirtualMachineImageResource call(VirtualMachineImageResourceInner inner) {
                return wrapVirtualMachineImageResourceModel(inner);
            }
        });
    }

}
