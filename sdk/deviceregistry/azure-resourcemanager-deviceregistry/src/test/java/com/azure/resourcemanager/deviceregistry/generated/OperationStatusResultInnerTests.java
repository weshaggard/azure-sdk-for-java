// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceregistry.fluent.models.OperationStatusResultInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class OperationStatusResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationStatusResultInner model = BinaryData.fromString(
            "{\"id\":\"ijbpzvgnwzsymgl\",\"name\":\"fcyzkohdbihanufh\",\"status\":\"cbjy\",\"percentComplete\":17.669842734724504,\"startTime\":\"2021-08-11T05:57:13Z\",\"endTime\":\"2021-03-22T18:05:05Z\",\"operations\":[{\"id\":\"ifpikxwczby\",\"name\":\"npqxuh\",\"status\":\"vyq\",\"percentComplete\":15.130435019780164,\"startTime\":\"2021-09-23T11:59:12Z\",\"endTime\":\"2021-04-19T10:59:49Z\",\"operations\":[{\"id\":\"umjgrtfwvuk\",\"name\":\"audccsnhs\",\"status\":\"cnyejhkryhtnapcz\",\"percentComplete\":31.021001091343102,\"startTime\":\"2021-01-02T05:45:31Z\",\"endTime\":\"2021-02-13T10:58:08Z\",\"operations\":[{\"status\":\"vnipjox\"},{\"status\":\"jnchgej\"},{\"status\":\"podmailzydehojwy\"}]}]},{\"id\":\"inpm\",\"name\":\"jaqwixjsp\",\"status\":\"ozvcput\",\"percentComplete\":40.087762783830804,\"startTime\":\"2021-03-22T16:44:16Z\",\"endTime\":\"2021-10-18T16:43:09Z\",\"operations\":[{\"id\":\"cmdv\",\"name\":\"hulsuuvmkjozkrwf\",\"status\":\"dio\",\"percentComplete\":59.75135945335241,\"startTime\":\"2021-01-15T11:02:51Z\",\"endTime\":\"2021-12-01T09:09:34Z\",\"operations\":[{\"status\":\"vwryoqpso\"},{\"status\":\"cctazakljlahbc\"},{\"status\":\"yffdfdos\"},{\"status\":\"gexpaojakhmsbz\"}]}]},{\"id\":\"zevdphlx\",\"name\":\"lthqtrgqjbp\",\"status\":\"zfsinzgvf\",\"percentComplete\":93.3282109723622,\"startTime\":\"2021-11-02T15:47:25Z\",\"endTime\":\"2021-08-01T19:04:33Z\",\"operations\":[{\"id\":\"elluwfziton\",\"name\":\"qfpjk\",\"status\":\"lxofpdvhpfxxypin\",\"percentComplete\":99.97950835952206,\"startTime\":\"2020-12-20T00:37:56Z\",\"endTime\":\"2021-10-31T20:57:40Z\",\"operations\":[{\"status\":\"kpode\"},{\"status\":\"ooginuvamih\"},{\"status\":\"ognarxzxtheotus\"},{\"status\":\"vyevcciqi\"}]},{\"id\":\"un\",\"name\":\"wjzrnfygxgisp\",\"status\":\"mvtzfkufub\",\"percentComplete\":16.258836308803303,\"startTime\":\"2021-07-07T00:34:51Z\",\"endTime\":\"2021-11-23T03:14:50Z\",\"operations\":[{\"status\":\"aeqjhqjbasvms\"}]}]},{\"id\":\"lngsntnbybkzgcwr\",\"name\":\"lxxwrljdouskc\",\"status\":\"vkocrcjdkwtn\",\"percentComplete\":98.36213425160699,\"startTime\":\"2021-08-22T09:01:35Z\",\"endTime\":\"2021-05-23T21:52:10Z\",\"operations\":[{\"id\":\"gls\",\"name\":\"inqpjwnzll\",\"status\":\"fmppe\",\"percentComplete\":43.36704068838252,\"startTime\":\"2021-08-08T05:23:22Z\",\"endTime\":\"2021-07-04T23:44:32Z\",\"operations\":[{\"status\":\"yqduujit\"},{\"status\":\"jczdzevndh\"},{\"status\":\"rwpdappdsbdkvwrw\"}]},{\"id\":\"usnhutje\",\"name\":\"mrldhu\",\"status\":\"jzzd\",\"percentComplete\":94.72452696725438,\"startTime\":\"2021-11-19T10:20:29Z\",\"endTime\":\"2021-09-07T21:28:24Z\",\"operations\":[{\"status\":\"ablgphuticndvk\"},{\"status\":\"ozwyiftyhxhuro\"}]},{\"id\":\"yxolniwp\",\"name\":\"ukjfkgiawxklr\",\"status\":\"plwckbas\",\"percentComplete\":94.59322503623605,\"startTime\":\"2021-07-26T02:42:45Z\",\"endTime\":\"2021-01-22T11:53:13Z\",\"operations\":[{\"status\":\"bacphejko\"},{\"status\":\"ynqgoulzndlikwyq\"},{\"status\":\"gfgibm\"},{\"status\":\"dgak\"}]},{\"id\":\"rxybz\",\"name\":\"e\",\"status\":\"qytbciq\",\"percentComplete\":28.991778696201052,\"startTime\":\"2021-02-10T20:24:35Z\",\"endTime\":\"2021-03-13T18:03:58Z\",\"operations\":[{\"status\":\"smodmgloug\"}]}]}]}")
            .toObject(OperationStatusResultInner.class);
        Assertions.assertEquals("ijbpzvgnwzsymgl", model.id());
        Assertions.assertEquals("fcyzkohdbihanufh", model.name());
        Assertions.assertEquals("cbjy", model.status());
        Assertions.assertEquals(17.669842734724504D, model.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-11T05:57:13Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-22T18:05:05Z"), model.endTime());
        Assertions.assertEquals("ifpikxwczby", model.operations().get(0).id());
        Assertions.assertEquals("npqxuh", model.operations().get(0).name());
        Assertions.assertEquals("vyq", model.operations().get(0).status());
        Assertions.assertEquals(15.130435019780164D, model.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-23T11:59:12Z"), model.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-19T10:59:49Z"), model.operations().get(0).endTime());
        Assertions.assertEquals("umjgrtfwvuk", model.operations().get(0).operations().get(0).id());
        Assertions.assertEquals("audccsnhs", model.operations().get(0).operations().get(0).name());
        Assertions.assertEquals("cnyejhkryhtnapcz", model.operations().get(0).operations().get(0).status());
        Assertions.assertEquals(31.021001091343102D, model.operations().get(0).operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-02T05:45:31Z"),
            model.operations().get(0).operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-13T10:58:08Z"),
            model.operations().get(0).operations().get(0).endTime());
        Assertions.assertEquals("vnipjox", model.operations().get(0).operations().get(0).operations().get(0).status());
    }
}
